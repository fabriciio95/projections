package com.projections.domain.projection.dto;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface ProjecaoBibliotecaDTOSpringDataJPa {

	@JsonProperty("biblioteca-endereco")
	@Value("#{target.nome + ' - ' + target.endereco.logradouro}")
	String getNomeEEnderecoBiblioteca();
}
