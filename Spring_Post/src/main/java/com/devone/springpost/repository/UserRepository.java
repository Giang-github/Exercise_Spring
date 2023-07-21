package com.devone.springpost.repository;

import com.devone.springpost.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Author, String> {

}
