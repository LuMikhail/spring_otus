package otus.spring.homework3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import otus.spring.homework3.dao.Source;
import otus.spring.homework3.dao.SourceCsv;


@Configuration
@ConfigurationProperties(prefix = "application")
public class AppConfig {

    @Bean
    public Source source(@Value("${test.resourcePath}")String resourcePath) {
        return new SourceCsv(resourcePath);
    }
}
