package kafka.kafka_consumer.dao;

import kafka.kafka_consumer.model.RecordFromMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordFromMapRepository extends JpaRepository<RecordFromMap, Long > {
}