package kafka.kafka_consumer.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import kafka.kafka_consumer.dao.RecordFromMapRepository;
import kafka.kafka_consumer.dao.SensorRecordRepository;

import kafka.kafka_consumer.model.RecordFromMap;
import kafka.kafka_consumer.model.SensorRecord;
import kafka.kafka_consumer.util.ModelParser;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class Consumer {
    ModelParser modelParser = new ModelParser();
    ObjectMapper mapper = new ObjectMapper();

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
    @Autowired
    SensorRecordRepository sensorRecordRepository;
    @Autowired
    RecordFromMapRepository realRecordRepository;
    Map<String, String> map=new HashMap<>();
    @KafkaListener(topics = "zsmk-9433-dev-01", groupId = "buloshnaya")
    public void consume(ConsumerRecord<String, String> message, @Header(KafkaHeaders.RECEIVED_TIMESTAMP) String timestamp) throws JsonProcessingException {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
       // logger.info(String.format("#### -&gt; Consumed message -&gt; %s", message));
        //SensorRecord sensorRecord = modelParser.toSensorRecord(message);
        //logger.info(sensorRecord.toString());
//        Object obj = JSONValue.parse(message.value());
//        JSONObject jsonnObject = (JSONObject) obj;
//        JSONObject moment = (JSONObject) jsonnObject.get("Message");
        //System.out.println("Sout:" +message.value());
        logger.info(String.format("#### -&gt; Value message -&gt; %s", message.value()));
       map = mapper.readValue(message.value(), new TypeReference<Map<String,String>>(){});
     //   map.forEach((key, value) -> System.out.println(key + " " + value));

        for (Map.Entry<String, String> entry : map.entrySet()) {
            RecordFromMap realRecord = new RecordFromMap(entry.getKey(),  entry.getValue(),timestamp);
            logger.info(String.format("#### -&gt; RecordFromMap -&gt; %s", realRecord.toString()));
            realRecordRepository.save(realRecord);

        }

//        logger.info(String.format("#### -&gt; RealRecord  -&gt; %s", realRecord.toString()));

        map.clear();
        //sensorRecordRepository.save(sensorRecord);


    }
}
