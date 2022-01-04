package com.projections.domain.projection.dto;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projections.domain.model.Autor;

@Repository
public interface ProjecaoAutorDTOSpringDataJPARepository extends CrudRepository<Autor, Long>{

	@Query("SELECT autor FROM Autor autor JOIN FETCH autor.livros WHERE autor.nome = :nome")
	ProjecaoAutorDTOAninhadoSpringDataJPA getByNome(String nome);
	
}
