package kiomnd2.icflixcaller.infrastructure.alarm.telegram;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TelegramMessageInfo {
    private String chatId;
    private String text;
}
