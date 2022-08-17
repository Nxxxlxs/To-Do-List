package com.nxxxlxs.ToDoList.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_toDo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
    
    @Column
    private String descricao;
    
    @Column
    private Boolean completa;

    @Column
    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate prazo;
    
    

}
