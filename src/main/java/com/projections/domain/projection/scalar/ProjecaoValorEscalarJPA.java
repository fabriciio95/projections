package com.projections.domain.projection.scalar;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.projections.domain.model.Livro;

@Repository
public class ProjecaoValorEscalarJPA {

	@PersistenceContext
	private EntityManager manager;
	
	public List<Livro> listarLivros() {
		TypedQuery<Tuple> query = manager.createQuery("SELECT l.paginas, l.nome FROM Livro l", Tuple.class);
		
		List<Tuple> livrosTupla = query.getResultList();
		
		List<Livro> livros = new ArrayList<>();
		
		for(int i = 0; i < livrosTupla.size(); i++) {
			Tuple livroTupla = livrosTupla.get(i);
			
			String nome = livroTupla.get(1, String.class);
			
			Integer paginas = livroTupla.get(0, Integer.class);
			
			Livro livro = new Livro();
			
			livro.setNome(nome);
			
			livro.setPaginas(paginas);
			
			livros.add(livro);
		}
		
		return livros;
		
	}
}
