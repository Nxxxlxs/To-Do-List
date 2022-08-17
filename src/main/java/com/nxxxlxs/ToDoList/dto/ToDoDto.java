package com.nxxxlxs.ToDoList.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDoDto {
	
	private Long id;
	private String descricao;
	private Boolean completa;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate prazo;
}
