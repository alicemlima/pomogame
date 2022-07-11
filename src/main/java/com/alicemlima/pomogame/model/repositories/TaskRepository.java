package com.alicemlima.pomogame.model.repositories;

import com.alicemlima.pomogame.model.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
