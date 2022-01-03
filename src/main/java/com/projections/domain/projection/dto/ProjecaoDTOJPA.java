package com.projections.domain.projection.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.projections.domain.model.Livro;

@Repository
public class ProjecaoDTOJPA {

	@PersistenceContext
	private EntityManager manager;
	
	public List<Livro> listarLivros() {
		List<LivroDTO> livrosDto = manager
				.createQuery("SELECT new com.projections.domain.projection.dto.LivroDTO(l.nome, l.paginas) FROM Livro l",
						LivroDTO.class).getResultList();
		
		return livrosDto.stream().map(livroDto -> {
			Livro livro = new Livro();
			livro.setNome(livroDto.getNome());
			livro.setPaginas(livroDto.getPaginas());
			return livro;
		}).toList();
	}
}
