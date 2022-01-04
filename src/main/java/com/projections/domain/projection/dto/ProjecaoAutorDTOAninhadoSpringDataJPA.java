package com.projections.domain.projection.dto;

import java.util.List;

public interface ProjecaoAutorDTOAninhadoSpringDataJPA {

	String getNome();
	
	List<Livro> getLivros();
	
	interface Livro {
		String getNome();
	}
}
