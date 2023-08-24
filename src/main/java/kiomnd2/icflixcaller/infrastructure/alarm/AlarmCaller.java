package kiomnd2.icflixcaller.infrastructure.alarm;

import kiomnd2.icflixcaller.domain.alarm.AlarmCommand;

public interface AlarmCaller {
    boolean support(AlarmType type);
    void send(AlarmCommand.RequestAlarm requestAlarm);
}
