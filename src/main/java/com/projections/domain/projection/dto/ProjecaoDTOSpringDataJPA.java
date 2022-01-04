package com.projections.domain.projection.dto;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projections.domain.model.Livro;

@Repository
public interface ProjecaoDTOSpringDataJPA extends CrudRepository<Livro, Long>{

	@Query("SELECT new com.projections.domain.projection.dto.LivroDTO(l.nome, l.paginas) FROM Livro l")
	List<LivroDTO> listarLivros();
	
	List<LivroDTO> findByNome(String nome);
	
	List<LivroProjecao> getByNome(String nome);
	
}
