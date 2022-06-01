package com.architecturelab.evaluations.application;

import com.architecturelab.evaluations.application.config.correlation.CorrelationIdInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@SpringBootApplication(scanBasePackages = "com.architecturelab.evaluations")
public class EvaluationsRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvaluationsRestApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate() {
            {
                setInterceptors(Collections.singletonList(new CorrelationIdInterceptor()));
            }
        };
    }
}
