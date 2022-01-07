package com.projections.domain.projection.dto;

import java.util.ArrayList;
import java.util.List;

import com.projections.domain.model.Endereco;

public class BibliotecaDTO {

	private Long id;
	
	private String nome;

	private Endereco endereco;
	

	private List<LivroDTO> livros = new ArrayList<>();

	public BibliotecaDTO(Long id, String nome, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<LivroDTO> getLivrosDTO() {
		return livros;
	}

	public void setLivrosDTO(List<LivroDTO> livros) {
		this.livros = livros;
	}

}
