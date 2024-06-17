package com.Webtech.Mertcan.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootTest
public class DemoApplicationTest {

 @Test
    void contextLoads() {

 }
    @Configuration
    static class TestConfig {

        @Bean
        public String exampleBean() {
            return "example";

    }
}
}

