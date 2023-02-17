package kafka.kafka_consumer.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
//@RequiredArgsConstructor
@Builder
@AllArgsConstructor
//@ToString(of = {"id", "email", "username", "password"})
@ToString
@Table(name = "sensor_record")
public class SensorRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @ToString.Exclude
    private Long id;
    @ToString.Exclude
    private String createdAt;
    private String place;
    @Column(length = 10485760)
    private String value;
    public SensorRecord() {
    }

    public SensorRecord(String createdAt, String place, String value) {
        this.createdAt = createdAt;
        this.place = place;
        this.value = value;
    }
}

