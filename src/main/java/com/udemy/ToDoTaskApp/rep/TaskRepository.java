package com.udemy.ToDoTaskApp.rep;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.ToDoTaskApp.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

}
