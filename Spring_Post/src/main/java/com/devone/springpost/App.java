package com.devone.springpost;

import com.devone.springpost.controller.AuthorController;

public class App {
    public static void main(String[] args) {
        AuthorController authorController = new AuthorController();
        System.out.println(authorController.getAll());
    }
}
