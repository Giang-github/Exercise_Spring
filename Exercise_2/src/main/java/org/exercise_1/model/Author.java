package org.exercise_1.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
public class Author {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    private LocalDateTime added;

    public Author(String username, String password, String firstName, String
            lastName, String email, LocalDate birthDate, LocalDateTime added) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.added = added;
    }

    @Override
    public String toString() {
        return "Author{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", added=" + added +
                '}';
    }
}

