package org.exercise_1.config;

import org.exercise_1.dao.MockAuthorDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorDaoConfig {
    @Bean
    public MockAuthorDao mockUserDao(){
        return new MockAuthorDao();
    }
}
