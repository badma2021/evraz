package kafka.kafka_consumer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import kafka.kafka_consumer.model.RecordFromMap;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;
import org.springframework.util.NumberUtils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class Consumer {
    ObjectMapper mapper = new ObjectMapper();
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
    @Autowired
    SensorRecordService sensorRecordService;
    Map<String, String> map = new HashMap<>();

    @KafkaListener(topics = "zsmk-9433-dev-01", groupId = "buloshnaya")
    public void consume(ConsumerRecord<String, String> message, @Header(KafkaHeaders.RECEIVED_TIMESTAMP) String timestamp) throws JsonProcessingException {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        logger.info(String.format("#### -&gt; Value message -&gt; %s", message.value()));
        map = mapper.readValue(message.value(), new TypeReference<>() {
        });

        map.entrySet().stream().skip(1).forEach((e) -> {
            RecordFromMap realRecord = new RecordFromMap(e.getKey(), NumberUtils.parseNumber(e.getValue(), BigDecimal.class), timestamp);

            logger.info(String.format("#### -&gt; RecordFromMap -&gt; %s", realRecord.toString()));
            sensorRecordService.save(realRecord);

        });
//        if(map.get("SM_Exgauster\\[0:33]")>=map.get("SM_Exgauster\\[0:69]") || map.get("SM_Exgauster\[0:33]").value
//            >=map.get("SM_Exgauster\[0:78]").value){}

        map.clear();


    }
}
