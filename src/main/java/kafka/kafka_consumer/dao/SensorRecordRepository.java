package kafka.kafka_consumer.dao;

import kafka.kafka_consumer.model.SensorRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRecordRepository extends JpaRepository<SensorRecord, Long > {
}
