package com.theironyard.services;

import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;

/**
 * Created by alexanderhughes on 3/16/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
