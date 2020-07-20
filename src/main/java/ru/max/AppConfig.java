package ru.max;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.max")
public class AppConfig {

    @Bean
    public MessageRenderer messageRenderer() {
        return new StandardImplMessageRenderer(message());
    }

    @Bean
    public Message message() {
        return new HelloMessage("Hi");
    }


}
