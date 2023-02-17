package otus.spring.homework3.dao;

import org.springframework.stereotype.Component;
import otus.spring.homework3.service.locale.LocaleStudent;

@Component
public class ConsoleOutput implements Output {

    private LocaleStudent localeTest;

    @Override
    public void println(String s, Object... obj) {
        System.out.printf(s, obj);
    }

}
