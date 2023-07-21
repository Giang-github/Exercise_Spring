package com.devone.springpost.controller;

import com.devone.springpost.model.Author;
import com.devone.springpost.service.AuthorService;

import java.util.List;

public class AuthorController {
    private AuthorService authorService = new AuthorService();
    public List<Author> getAll() {
        return authorService.getAll();
    }
    public Author getAuthorByUsername(String username) {
        return authorService.getAuthorByUsername(username);
    }
    public void deleteAuthorByUsername(String username) {
        authorService.deleteAuthorByUsername(username);
    }
    public void createAuthor(Author author) {
        authorService.createAuthor(author);
    }
}
