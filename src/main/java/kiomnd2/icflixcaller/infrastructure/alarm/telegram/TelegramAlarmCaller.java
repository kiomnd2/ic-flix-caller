package kiomnd2.icflixcaller.infrastructure.alarm.telegram;

import kiomnd2.icflixcaller.domain.alarm.AlarmCommand;
import kiomnd2.icflixcaller.infrastructure.alarm.AlarmCaller;
import kiomnd2.icflixcaller.infrastructure.alarm.AlarmType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Component
public class TelegramAlarmCaller implements AlarmCaller {
    private final RestTemplate restTemplate;
    private final TelegramProperties telegramProperties;

    @Override
    public boolean support(AlarmType type) {
        return type == AlarmType.TELEGRAM;
    }

    @Override
    public void send(AlarmCommand.RequestAlarm requestAlarm) {
        TelegramMessageInfo message = TelegramMessageInfo.builder()
                .chatId(telegramProperties.getChatId())
                .text(requestAlarm.getMessage())
                .build();
        HttpEntity<String> request = new HttpEntity<>(requestAlarm.toString());
        String s = restTemplate.postForObject(telegramProperties.getSendUrl(), request, String.class);
        System.out.println("s = " + s);
    }
}
