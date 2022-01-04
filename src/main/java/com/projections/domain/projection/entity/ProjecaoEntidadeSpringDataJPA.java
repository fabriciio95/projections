package com.projections.domain.projection.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projections.domain.model.Biblioteca;

public interface ProjecaoEntidadeSpringDataJPA extends JpaRepository<Biblioteca, Long> {

	List<Biblioteca> findByNomeContainingIgnoreCase(String nome);
}
