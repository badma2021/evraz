package kafka.kafka_consumer.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Getter
@Setter
//@RequiredArgsConstructor
@Builder
@AllArgsConstructor
@ToString
@Table
public class RecordFromMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @ToString.Exclude
    private Long id;
    private String sensor;
    private Double value;
    private String date;

    public RecordFromMap(String sensor, Double value, String date) {
        this.sensor = sensor;
        this.value = value;
        this.date = date;
    }
}
