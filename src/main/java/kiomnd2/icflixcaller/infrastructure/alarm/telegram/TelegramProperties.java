package kiomnd2.icflixcaller.infrastructure.alarm.telegram;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "telegram")
public class TelegramProperties {
    private String url;
    private String chatId;
    private String token;
}
