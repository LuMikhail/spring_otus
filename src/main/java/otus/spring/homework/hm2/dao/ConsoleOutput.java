package otus.spring.homework.hm2.dao;

import org.springframework.stereotype.Component;

@Component
public class ConsoleOutput implements Output {

    @Override
    public void println(String s, Object... obj) {
        System.out.printf(s, obj);
    }
}
