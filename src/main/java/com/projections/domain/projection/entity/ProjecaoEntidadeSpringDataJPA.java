package com.projections.domain.projection.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projections.domain.model.Biblioteca;

public interface ProjecaoEntidadeSpringDataJPA extends JpaRepository<Biblioteca, Long> {

	List<Biblioteca> findByNomeContainingIgnoreCase(String nome);
	
	@Query("SELECT biblioteca FROM Biblioteca biblioteca JOIN FETCH biblioteca.endereco WHERE biblioteca.nome = :nome")
	<T> T findByNome(String nome, Class<T> type);
	
}
