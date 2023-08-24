package kiomnd2.icflixcaller.infrastructure.alarm;

import kiomnd2.icflixcaller.domain.alarm.AlarmCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TelegramAlarmCaller implements AlarmCaller{

    @Override
    public boolean support(AlarmType type) {
        return type == AlarmType.TELEGRAM;
    }

    @Override
    public void send(AlarmCommand.RequestAlarm requestAlarm) {

    }
}
