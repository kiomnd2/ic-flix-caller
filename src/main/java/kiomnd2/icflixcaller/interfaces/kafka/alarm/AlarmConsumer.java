package kiomnd2.icflixcaller.interfaces.kafka.alarm;

import kiomnd2.icflixcaller.domain.alarm.AlarmCommand;
import kiomnd2.icflixcaller.domain.alarm.AlarmSender;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Component
public class AlarmConsumer {
    private final AlarmSender alarmSender;

    @KafkaListener(id = "alarm-listener", topics = "${kafka.consumer.topic}")
//    @SendTo("test")
    public String listenAlarm(ConsumerRecord<?,?> record) {
        AlarmCommand.RequestAlarm message = AlarmCommand.RequestAlarm.builder()
                .title("Alarm Test")
                .message(record.value().toString())
                .sendAt(LocalDateTime.now())
                .writer("author")
                .build();
        alarmSender.sendAlarm(message);
        return "ok";
    }
}
