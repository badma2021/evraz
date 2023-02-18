package kafka.kafka_consumer.util;

import kafka.kafka_consumer.model.SensorRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class ModelParser {
    ;

    public SensorRecord toSensorRecord(ConsumerRecord<String, String> message) {

        SensorRecord sensorRecord = new SensorRecord();
        Object obj = JSONValue.parse(message.value());
        JSONObject jsonnObject = (JSONObject) obj;
        String moment = (String) jsonnObject.get("Message");
      //  sensorRecord.setValue(message);
        sensorRecord.setCreatedAt("1");
        sensorRecord.setPlace("1");
        return sensorRecord;
    }
}
