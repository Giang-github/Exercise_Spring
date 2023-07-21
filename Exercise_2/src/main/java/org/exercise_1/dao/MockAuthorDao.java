package org.exercise_1.dao;



import org.exercise_1.model.Author;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MockAuthorDao {
    private List<Author> mockData;
    public MockAuthorDao() {
        mockData = new ArrayList<>();
        mockData.add(new Author("john", "1234", "John", "Doe",
                "john@gmail.com", LocalDate.now(), LocalDateTime.now()));
        mockData.add(new Author("mark", "0959", "Mark", "Buff",
                "mark@gmail.com", LocalDate.now(), LocalDateTime.now()));
        mockData.add(new Author("Mike", "4365", "Mike", "Nguyen",
                "mike@gmail.com", LocalDate.now(), LocalDateTime.now()));
    }
    public List<Author> getAll() {
        return mockData;
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
