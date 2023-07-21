package org.exercise_1.service;


import org.exercise_1.dao.MockAuthorDao;
import org.exercise_1.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorService {
    private MockAuthorDao mockAuthorDao ;

    @Autowired
    public AuthorService(MockAuthorDao mockAuthorDao) {
        this.mockAuthorDao = mockAuthorDao;
    }

    public List<Author> getAll() {
        return mockAuthorDao.getAll();
    }
    public Author getAuthorByUsername(String username) {
        return mockAuthorDao.getAuthorByUsername(username);
    }
    public void deleteAuthorByUsername(String username) {
        mockAuthorDao.deleteAuthorByUsername(username);
    }
    public void createAuthor(Author author) {
        mockAuthorDao.createAuthor(author);
    }
}
