package kiomnd2.icflixcaller.infrastructure.alarm;

import kiomnd2.icflixcaller.domain.alarm.AlarmCommand;

public interface AlarmCaller {
    void send(AlarmCommand.RequestAlarm requestAlarm);
}
