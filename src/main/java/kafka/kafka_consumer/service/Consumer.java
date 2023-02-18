package kafka.kafka_consumer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import kafka.kafka_consumer.dao.RealRecordRepository;
import kafka.kafka_consumer.dao.SensorRecordRepository;
import kafka.kafka_consumer.model.RealRecord;
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

@Service
public class Consumer {
    ModelParser modelParser = new ModelParser();
    ObjectMapper mapper = new ObjectMapper();

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
    @Autowired
    SensorRecordRepository sensorRecordRepository;
    @Autowired
    RealRecordRepository realRecordRepository;

    @KafkaListener(topics = "zsmk-9433-dev-01", groupId = "buloshnaya")
    public void consume(ConsumerRecord<String, String> message, @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long timestamp) throws JsonProcessingException {
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
        RealRecord realRecord = mapper.readValue(message.value(), RealRecord.class);
        logger.info(String.format("#### -&gt; RealRecord  -&gt; %s", realRecord.toString()));
        realRecordRepository.save(realRecord);
        //sensorRecordRepository.save(sensorRecord);


    }
}
