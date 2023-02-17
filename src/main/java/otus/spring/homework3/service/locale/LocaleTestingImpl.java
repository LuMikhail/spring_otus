package otus.spring.homework3.service.locale;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import otus.spring.homework3.config.LocaleProps;
import otus.spring.homework3.dao.Output;

@Component
public class LocaleTestingImpl implements LocaleTesting {
    private final MessageSource messageSource;
    private final LocaleProps locale;
    private final Output output;

    public LocaleTestingImpl(MessageSource messageSource, LocaleProps locale, Output output) {
        this.messageSource = messageSource;
        this.locale = locale;
        this.output = output;
    }

    @Override
    public void startLocaleWhatTestAbout() {
      output.println(messageSource.getMessage("message.start", null, locale.getLocale()));
    }

    @Override
    public String getLocaleTestReport() {
        return messageSource.getMessage("message.report", null, locale.getLocale());
    }
}
