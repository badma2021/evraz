package kafka.kafka_consumer.service;

import kafka.kafka_consumer.dao.SensorRecordRepository;
import kafka.kafka_consumer.model.SensorRecord;
import kafka.kafka_consumer.util.ModelParser;
import org.apache.kafka.clients.consumer.ConsumerRecord;
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
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
    @Autowired
    SensorRecordRepository sensorRecordRepository;

    @KafkaListener(topics = "zsmk-9433-dev-01", groupId = "buloshnaya")
    public void consume(String message, @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long timestamp) {
        logger.info(String.format("#### -&gt; Consumed message -&gt; %s", message));
        SensorRecord sensorRecord = modelParser.toSensorRecord(message);
        logger.info(sensorRecord.toString());
        sensorRecordRepository.save(sensorRecord);


    }
}
