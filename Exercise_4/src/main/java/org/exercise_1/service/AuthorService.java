package org.exercise_1.service;

import org.exercise_1.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAll();

    Author getAuthorByUsername(String username);

    void deleteAuthorByUsername(String username);

    void createAuthor(Author author);
}
