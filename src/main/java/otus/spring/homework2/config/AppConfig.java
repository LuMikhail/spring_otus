package otus.spring.homework2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import otus.spring.homework2.dao.*;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Value("${resourcePath}")
    @Bean
    public Source source(String source) {
        return new SourceCsv(source);
    }
}
