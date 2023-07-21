package org.exercise_1.config;

import org.exercise_1.controller.AuthorController;
import org.exercise_1.dao.MockAuthorDao;
import org.exercise_1.service.AuthorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MockAuthorDao mockAuthorDao(){
        return new MockAuthorDao();
    }
    @Bean
    public AuthorService authorService() {
        return new AuthorService(mockAuthorDao());
    }

    @Bean
    public AuthorController authorController() {
        return new AuthorController(authorService());
    }
}

