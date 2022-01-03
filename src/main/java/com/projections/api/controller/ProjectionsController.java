package com.projections.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projections.domain.model.Livro;
import com.projections.domain.projection.dto.ProjecaoDTOJPA;
import com.projections.domain.projection.entity.ProjecaoEntidadeJPA;
import com.projections.domain.projection.scalarvalue.ProjecaoValorEscalarJPA;

@RestController
@RequestMapping("/projections")
public class ProjectionsController {

	@Autowired
	private ProjecaoDTOJPA projecao;
	
	@GetMapping("/livros")
	public List<Livro> listarLivros() {
		return projecao.listarLivros();
	}
}
