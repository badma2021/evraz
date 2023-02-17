package kafka.kafka_consumer.config;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.config.SslConfigs;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {
    @Value("${spring.kafka.bootstrap-servers}")
    private String kafkaServer;
    @Value("${spring.kafka.consumer.auto-offset-reset}")
    private String consumerAutOffsetReset;
    @Value("${spring.kafka.consumer.group-id}")
    private String kafkaGroupId;
    @Value("${spring.kafka.properties.sasl.mechanism}")
    private String propertiesSaslMechanism;
    @Value("${spring.kafka.properties.security.protocol}")
    private String propertiesSecurityProtocol;
    @Value("${spring.kafka.properties.sasl.jaas.config}")
    private String propertiesJaasConfig;
    @Value("${spring.kafka.consumer.max-poll-records}")
    private String consumerMaxPollRecords;
    @Value("${spring.kafka.consumer.enable-auto-commit}")
    private String consumerEnableAutoCommit;
    @Value("${spring.kafka.properties.ssl.truststore-location}")
    private String propertiesSslKeystoreLocation;
    @Value("${spring.kafka.properties.ssl.truststore-password}")
    private String propertiesSslKeystorePassword;


    @Bean
    public Map<String, Object> consumerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
                kafkaServer);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
                LongSerializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
                StringSerializer.class);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, kafkaGroupId);
        props.put("sasl.mechanism", propertiesSaslMechanism);

        props.put("sasl.jaas.config", propertiesJaasConfig);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, consumerAutOffsetReset);
        props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, consumerMaxPollRecords);
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, consumerEnableAutoCommit);
        props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, propertiesSecurityProtocol);
        props.put("ssl.truststore.location", propertiesSslKeystoreLocation);
        props.put("ssl.truststore.password", propertiesSslKeystorePassword);




        return props;
    }

//    @Bean
//    public KafkaListenerContainerFactory<?> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<Long, String> factory =
//                new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
//
//    @Bean
//    public ConsumerFactory<Long, String> consumerFactory() {
//        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
//    }
}
