package com.projections.domain.projection;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projections.domain.model.Biblioteca;
import com.projections.domain.projection.dto.ProjecaoBibliotecaDTOSpringDataJPa;

@Repository
public interface ProjecaoBibliotecaDTOSpringDataJPaRepository extends JpaRepository<Biblioteca, Long>{

	List<ProjecaoBibliotecaDTOSpringDataJPa> getByNome(String nome); 
}
