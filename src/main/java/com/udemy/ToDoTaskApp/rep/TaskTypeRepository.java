package com.udemy.ToDoTaskApp.rep;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.ToDoTaskApp.model.TaskType;
@Repository
public interface TaskTypeRepository extends CrudRepository<TaskType, Long>{

}
