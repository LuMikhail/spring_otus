package otus.spring.homework.hm2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import otus.spring.homework.hm2.dao.TestDao;
import otus.spring.homework.hm2.dao.TestDaoSimple;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Value("${resourcePath}")
    @Bean
    public TestDao testDao(String recourses) {
        return new TestDaoSimple(recourses);
    }
}
