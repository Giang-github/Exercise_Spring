package org.exercise_1;

import org.exercise_1.aop.AspectMetrics;
import org.exercise_1.controller.AuthorController;
import org.exercise_1.model.Author;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;


@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        AuthorController authorController = context.getBean(AuthorController.class);
        for(int i = 1; i < 10; i++){
            authorController.getAll();
        }
        for(int i = 1; i < 11; i++){
            authorController.getAuthorByUsername("username");
        }
        for(int i = 1; i < 12; i++){
            authorController.deleteAuthorByUsername("username");
        }
        Author author = new Author("Mike", "4365", "Mike", "Nguyen",
                "mike@gmail.com", LocalDate.now(), LocalDateTime.now());
        authorController.createAuthor(author);
        AspectMetrics aspectMetrics = context.getBean(AspectMetrics.class);
        aspectMetrics.getTimeExecute();
    }
}
