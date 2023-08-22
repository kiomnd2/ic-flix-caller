package kiomnd2.icflixcaller.interfaces.kafka.alarm;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AlarmConsumer {

    @KafkaListener(id = "alarm-listener", topics = "${kafka.consumer.topic}")
//    @SendTo("test")
    public String listenAlarm(ConsumerRecord<?,?> record) {
        System.out.println("record = " + record);
        return "ok";
    }
}
