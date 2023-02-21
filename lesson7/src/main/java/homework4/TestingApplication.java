package homework4;

import homework4.config.AppConfig;
import homework4.config.LocaleProps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({LocaleProps.class, AppConfig.class})
@SpringBootApplication
public class TestingApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestingApplication.class, args);
    }
}
