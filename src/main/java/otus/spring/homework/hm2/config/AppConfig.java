package otus.spring.homework.hm2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import otus.spring.homework.hm2.dao.Input;
import otus.spring.homework.hm2.dao.Output;
import otus.spring.homework.hm2.dao.TestDao;
import otus.spring.homework.hm2.dao.TestDaoSimple;
import otus.spring.homework.hm2.service.TestService;
import otus.spring.homework.hm2.service.TestServiceImpl;

@Configuration
public class AppConfig {

    @Value(value = "test_student2.csv")
    @Bean
    public TestDao testDao(String recourses) {
        return new TestDaoSimple(recourses);
    }

    @Bean
    public TestService testServiceImpl(TestDao dao, Output output, Input input) {
        return new TestServiceImpl(dao, output, input);
    }
}
