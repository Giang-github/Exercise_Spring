package org.exercise_1.dao;

import org.exercise_1.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class JDBCAuthorDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCAuthorDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Author> getAllAuthors() {
        String sqlQuery = "SELECT * FROM authors";
        return jdbcTemplate.query(sqlQuery, (rs, rowNum) -> {
            String username = rs.getString("username");
            String password = rs.getString("password");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String email = rs.getString("email");
            LocalDate birthDate = rs.getDate("birthdate").toLocalDate();
            LocalDateTime added = rs.getTimestamp("added").toLocalDateTime();

            return new Author(username, password, firstName, lastName, email, birthDate, added);
        });
    }

    public Author getAuthorByUsername(String username) {
        // TODO
        return null;
    }
    public void deleteAuthorByUsername(String username) {
        // TODO
    }
    public void createAuthor(Author author) {
        // TODO
    }

}
