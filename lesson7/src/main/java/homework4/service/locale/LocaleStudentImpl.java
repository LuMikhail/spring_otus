package homework4.service.locale;

import homework4.config.LocaleProps;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class LocaleStudentImpl implements LocaleStudent {

    private final MessageSource messageSource;
    private final LocaleProps locale;

    public LocaleStudentImpl(MessageSource messageSource, LocaleProps locale) {
        this.messageSource = messageSource;
        this.locale = locale;
    }

    @Override
    public String getLocaleFirstName() {
        return messageSource.getMessage("message.first.name", null, locale.getLocale());
    }

    @Override
    public String getLocaleSurname() {
        return messageSource.getMessage("message.surname", null, locale.getLocale());
    }
}
