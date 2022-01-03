package com.projections.domain.projection.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.projections.domain.model.Livro;

@Repository
public class ProjecaoEntidadeJPA {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Livro> listarLivros() {
		return entityManager.createQuery("SELECT l FROM Livro l", Livro.class).getResultList();
	}
}
