package com.nxxxlxs.ToDoList.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nxxxlxs.ToDoList.dto.ToDoDto;
import com.nxxxlxs.ToDoList.enums.ToDoStatus;

public interface ToDoService {
	
	ToDoDto salvar(ToDoDto toDoDto);
	ToDoDto atualizar(ToDoDto toDoDto);
	void deletar(Long id);
	Page<ToDoDto> buscarTodos(Pageable page);
}
