package com.alicemlima.pomogame.model.repositories;

import com.alicemlima.pomogame.model.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
