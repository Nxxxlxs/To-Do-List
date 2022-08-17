package com.nxxxlxs.ToDoList.serviceImpl;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nxxxlxs.ToDoList.dto.ToDoDto;
import com.nxxxlxs.ToDoList.enums.ToDoStatus;
import com.nxxxlxs.ToDoList.model.ToDo;
import com.nxxxlxs.ToDoList.repository.ToDoRepository;
import com.nxxxlxs.ToDoList.service.ToDoService;

@Service
public class ToDoServiceImpl implements ToDoService{
	
	private final ToDoRepository repository;
	private final ModelMapper modelMapper;
	
	@Autowired
	public ToDoServiceImpl(ToDoRepository repository, ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
		this.repository = repository;
	}
	
	
	public ToDoDto salvar(ToDoDto toDoDto) {
		return modelMapper.map(repository.save(modelMapper.map(toDoDto, ToDo.class)), ToDoDto.class);
	}

	@Transactional
	public ToDoDto atualizar(ToDoDto toDoDto) {
		return modelMapper.map(repository.save(modelMapper.map(toDoDto, ToDo.class)),ToDoDto.class);
	}

	@Transactional
	public void deletar(Long id) {
		repository.deleteById(id);
		
	}

	@Transactional
	public Page<ToDoDto> buscarTodos(Pageable pageable) {
		Page<ToDo> list = repository.findAll(pageable);
		return list.map(x -> modelMapper.map(x, ToDoDto.class));
	}
	
	@Transactional
    public ToDoDto buscarPorId(Long id) {
        return modelMapper.map(repository.findById(id).get(), ToDoDto.class);
    }

}
