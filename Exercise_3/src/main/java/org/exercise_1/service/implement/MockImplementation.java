package org.exercise_1.service.implement;

import org.exercise_1.dao.MockAuthorDao;
import org.exercise_1.model.Author;
import org.exercise_1.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MockImplementation implements AuthorService {
    private MockAuthorDao mockAuthorDao ;

    @Autowired
    public MockImplementation(MockAuthorDao mockAuthorDao) {
        this.mockAuthorDao = mockAuthorDao;
    }


    @Override
    public List<Author> getAll() {
        return mockAuthorDao.getAll();
    }

    @Override
    public Author getAuthorByUsername(String username) {
        return null;
    }

    @Override
    public void deleteAuthorByUsername(String username) {

    }

    @Override
    public void createAuthor(Author author) {

    }
}
