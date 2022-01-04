package com.raf.reservationservice.client.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class UserClientConfiguration {

    @Bean
    public RestTemplate userServiceRestTemplate(){
        RestTemplate template = new RestTemplate();
        template.setUriTemplateHandler(new DefaultUriBuilderFactory("http://localhost:8080"));


        return template;
    }
}
