package com;

import com.entity.Database;
import com.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.repository")
public class SpringBootApp {

    @Value("${server.port}")
    Integer port;

    @Value("${spring.datasource.name}")
    String name;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

    @Bean
    User getUser() {
        String username = "Siddharth";
        String password = "password";
        return new User(username, password);
    }

    @Bean
    Database getDatabase() {
        return new Database(name, port);
    }
}