package org.exercise_1;

import org.exercise_1.controller.AuthorController;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        AuthorController authorController = context.getBean(AuthorController.class);
        System.out.println(authorController.getAll());
    }
}
