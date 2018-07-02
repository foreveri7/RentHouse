package com.lk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Hello world!
 */
@EnableTransactionManagement
@SpringBootApplication
//        (exclude = {DataSourceAutoConfiguration.class})
@EnableScheduling
public class App {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
        System.out.println("Hello World!");
    }
}
