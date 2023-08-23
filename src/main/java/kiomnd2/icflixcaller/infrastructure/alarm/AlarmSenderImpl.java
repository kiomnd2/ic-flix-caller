package kiomnd2.icflixcaller.infrastructure.alarm;

import kiomnd2.icflixcaller.domain.alarm.AlarmCommand;
import kiomnd2.icflixcaller.domain.alarm.AlarmSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AlarmSenderImpl implements AlarmSender {
    private final AlarmCaller alarmCaller;
    @Override
    public void sendAlarm(AlarmCommand.RequestAlarm alarm) {
        alarmCaller.send(alarm);
    }
}
