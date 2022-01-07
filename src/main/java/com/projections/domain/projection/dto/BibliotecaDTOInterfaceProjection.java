package com.projections.domain.projection.dto;

public interface BibliotecaDTOInterfaceProjection{

	String getNome();

	Endereco getEndereco();
	
	interface Endereco {
		
		String getLogradouro();
	}
}
