package com.projections.domain.projection.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public interface BibliotecaDTOInterfaceProjection2{

	@Value("#{target.nome + ' - ' + target.endereco.logradouro}")
	String getNomeEEndereco();

	List<Livro> getLivros();
	
	interface Livro {
		
		String getNome();
	}
}
