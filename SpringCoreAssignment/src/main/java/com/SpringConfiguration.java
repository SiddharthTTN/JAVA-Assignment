package com;

import com.test.Triangle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Bean
    Triangle Triangle(){
        Triangle triangle=new Triangle();
        triangle.setAltitude(22);
        triangle.setBase(11);
        return triangle;
    }
}
