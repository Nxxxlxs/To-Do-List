package com.nxxxlxs.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxxxlxs.ToDoList.model.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
