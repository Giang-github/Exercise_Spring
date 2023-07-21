package com.devone.springpost.config;

import com.devone.springpost.dao.MockAuthorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class DaoConfig {

//    private final Environment environment;
//
//    @Autowired
//    public DaoConfig(Environment environment) {
//        this.environment = environment;
//    }
//
//    @Bean
//    MockAuthorDao mockUserDao() {
//        String username = environment.getProperty("personal.username");
//        String password = environment.getProperty("password");
//        return new MockAuthorDao(username, password);
//    }

}
