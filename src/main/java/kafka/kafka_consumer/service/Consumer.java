package kafka.kafka_consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
    public class Consumer {

        private final Logger logger = LoggerFactory.getLogger(Consumer.class);

        @KafkaListener(topics = "zsmk-9433-dev-01", groupId = "group_id")
        public void consume(String message) throws IOException {
            logger.info(String.format("#### -&gt; Consumed message -&gt; %s", message));
        }
}
