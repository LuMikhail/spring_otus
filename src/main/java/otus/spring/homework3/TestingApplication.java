package otus.spring.homework3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import otus.spring.homework3.config.AppConfig;
import otus.spring.homework3.config.LocaleProps;
import otus.spring.homework3.service.TestService;
import otus.spring.homework3.service.TestServiceImpl;

@EnableConfigurationProperties({LocaleProps.class, AppConfig.class})
@SpringBootApplication
public class TestingApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestingApplication.class, args);
        TestService service = context.getBean(TestServiceImpl.class);
        service.runTest();
    }
}
