package com.projections.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projections.domain.model.Livro;
import com.projections.domain.projection.dto.LivroDTO;
import com.projections.domain.projection.dto.LivroProjecao;
import com.projections.domain.projection.dto.ProjecaoDTOSpringDataJPA;

@RestController
@RequestMapping("/projections")
public class ProjectionsController {

	@Autowired
	private ProjecaoDTOSpringDataJPA projecao;
	
	@GetMapping("/livros")
	public List<Livro> listarLivros() {
//		List<Object[]> objetos =  projecao.listarLivros();
//		
//		return objetos.stream().map(livroObject -> {
//			Livro livro = new Livro();
//			livro.setNome((String) livroObject[0]);
//			livro.setPaginas((Integer) livroObject[1]);
//			return livro;
//		}).toList();
		
		return projecao.listarLivros().stream().map(livroDTO -> {
			Livro livro = new Livro();
			livro.setNome(livroDTO.getNome());
			livro.setPaginas(livroDTO.getPaginas());
			return livro;
		}).toList();
	}
	
	
	@GetMapping("/livros/search")
	public List<LivroDTO> listarLivrosPorNome(@RequestParam("nome") String nome) {
		return projecao.findByNome(nome);
		//return projecao.getByNome(nome);
	}
}
