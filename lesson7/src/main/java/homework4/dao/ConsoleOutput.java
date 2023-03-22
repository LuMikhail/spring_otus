package homework4.dao;

import homework4.service.locale.LocaleStudent;
import org.springframework.stereotype.Component;

@Component
public class ConsoleOutput implements Output {

    private LocaleStudent localeTest;

    @Override
    public void println(String s, Object... obj) {
        System.out.printf(s, obj);
    }

}
