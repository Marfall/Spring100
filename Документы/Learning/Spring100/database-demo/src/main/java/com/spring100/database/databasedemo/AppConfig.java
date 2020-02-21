package com.spring100.database.databasedemo;

import com.spring100.database.databasedemo.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

@Configuration
public class AppConfig {
//    @Bean
//    public BeanPropertyRowMapper<Person> beanPropertyRowMapper() {
//        return  new BeanPropertyRowMapper<>(Person.class);
//    }

    @Bean
    public BeanPropertyRowMapper<Person> beanPropertyRowMapper() {
        return  new BeanPropertyRowMapper<>(Person.class);
    }
}
