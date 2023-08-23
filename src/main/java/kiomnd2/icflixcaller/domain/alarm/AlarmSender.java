package kiomnd2.icflixcaller.domain.alarm;

public interface AlarmSender {
    void sendAlarm(AlarmCommand.RequestAlarm alarm);
}
