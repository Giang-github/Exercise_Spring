package org.exercise_1;

import org.exercise_1.config.AppConfig;
import org.exercise_1.controller.AuthorController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AuthorController authorController = context.getBean(AuthorController.class);
        System.out.println(authorController.getAll());
    }
}
