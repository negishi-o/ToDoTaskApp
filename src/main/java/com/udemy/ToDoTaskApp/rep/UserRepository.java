package com.udemy.ToDoTaskApp.rep;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.ToDoTaskApp.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
