package org.exercise_1.controller;


import org.exercise_1.model.Author;
import org.exercise_1.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {
    private AuthorService authorService;
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

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
