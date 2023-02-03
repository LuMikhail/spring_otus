package otus.spring.homework.hm1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import otus.spring.homework.hm1.dao.Input;
import otus.spring.homework.hm1.dao.Output;
import otus.spring.homework.hm1.dao.TestDao;
import otus.spring.homework.hm1.dao.TestDaoSimple;
import otus.spring.homework.hm1.service.TestService;
import otus.spring.homework.hm1.service.TestServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public TestDao testDao() {
        return new TestDaoSimple();
    }

    @Bean
    public TestService testServiceImpl(TestDao dao, Output output, Input input) {
        return new TestServiceImpl(dao, output, input);
    }
}
