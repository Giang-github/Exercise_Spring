package com.devone.springpost.service;

import com.devone.springpost.model.Author;
import com.devone.springpost.dao.MockAuthorDao;
import java.util.List;
public class AuthorService {
    private MockAuthorDao authorDao = new MockAuthorDao();
    public List<Author> getAll() {
        return authorDao.getAll();
    }
    public Author getAuthorByUsername(String username) {
        return authorDao.getAuthorByUsername(username);
    }
    public void deleteAuthorByUsername(String username) {
        authorDao.deleteAuthorByUsername(username);
    }
    public void createAuthor(Author author) {
        authorDao.createAuthor(author);
    }
}
