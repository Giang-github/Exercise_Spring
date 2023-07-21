package org.exercise_1.service.implement;

import org.exercise_1.dao.JDBCAuthorDao;
import org.exercise_1.model.Author;
import org.exercise_1.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("JDBCImplementation")
@Profile({"jdbc"})
public class JDBCImplementation implements AuthorService {
    private JDBCAuthorDao jdbcAuthorDao;
    public JDBCImplementation(JDBCAuthorDao jdbcAuthorDao){
        this.jdbcAuthorDao = jdbcAuthorDao;
    }
    @Override
    public List<Author> getAll() {
        return jdbcAuthorDao.getAllAuthors();
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
