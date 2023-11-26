package com.example;

import org.springframework.data.repository.CrudRepository; // Import statement added
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String name);
}
