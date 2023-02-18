package kafka.kafka_consumer.service;

import kafka.kafka_consumer.dao.RecordFromMapRepository;
import kafka.kafka_consumer.model.RecordFromMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class SensorRecordService {

    private final Logger logger = LoggerFactory.getLogger(SensorRecordService.class);
    @Autowired
    private RecordFromMapRepository recordFromMapRepository;

    @Async
    public void save(RecordFromMap recordFromMap) {

        recordFromMapRepository.save(recordFromMap);
    }
}
