package homework4.config;

import homework4.dao.Source;
import homework4.dao.SourceCsv;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "application")
public class AppConfig {

    @Bean
    public Source source(@Value("${test.resourcePath}")String resourcePath) {
        return new SourceCsv(resourcePath);
    }
}
