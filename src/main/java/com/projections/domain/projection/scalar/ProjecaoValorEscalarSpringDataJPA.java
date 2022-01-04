package com.projections.domain.projection.scalar;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projections.domain.model.Livro;

@Repository
public interface ProjecaoValorEscalarSpringDataJPA extends JpaRepository<Livro, Long>{

	@Query("SELECT l.nome, l.paginas FROM Livro l")
	List<Object[]> listarLivros();
}
