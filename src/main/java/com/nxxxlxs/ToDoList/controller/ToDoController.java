package com.nxxxlxs.ToDoList.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nxxxlxs.ToDoList.dto.ToDoDto;
import com.nxxxlxs.ToDoList.serviceImpl.ToDoServiceImpl;

@RestController
@RequestMapping(value = "/todo")
public class ToDoController {
	
	private final ToDoServiceImpl service;
	
	public ToDoController(ToDoServiceImpl service) {
		this.service = service;
	}
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ToDoDto> salvar(@RequestBody ToDoDto dto) {
        return ResponseEntity.ok(service.salvar(dto));
    }
	
	@DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        service.deletar(id);
    }
	
	 @GetMapping
	 public ResponseEntity<Page<ToDoDto>> buscarTodos(Pageable pageable) {
		 return ResponseEntity.ok(service.buscarTodos(pageable));
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<ToDoDto> buscarPorId(@PathVariable Long id) {
		 return ResponseEntity.ok(service.buscarPorId(id));
	 }
	 
	 @PutMapping("/{id}")
	 public ResponseEntity<ToDoDto> atualizar(@RequestBody ToDoDto toDoDto, @PathVariable Long id) {
		 toDoDto.setId(id);
		 return ResponseEntity.ok(service.atualizar(toDoDto));
	 }

}
