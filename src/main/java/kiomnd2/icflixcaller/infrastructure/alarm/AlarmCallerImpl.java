package kiomnd2.icflixcaller.infrastructure.alarm;

import kiomnd2.icflixcaller.domain.alarm.AlarmCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Component
public class AlarmCallerImpl implements AlarmCaller {
    private final RestTemplate restTemplate;
    @Override
    public void send(AlarmCommand.RequestAlarm requestAlarm) {
        // TODO SEND
    }
}
