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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getCompleta() {
		return completa;
	}
	public void setCompleta(Boolean completa) {
		this.completa = completa;
	}
	public LocalDate getPrazo() {
		return prazo;
	}
	public void setPrazo(LocalDate prazo) {
		this.prazo = prazo;
	}
	
	
}
