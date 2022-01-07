package com.projections.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projections.domain.model.Biblioteca;
import com.projections.domain.model.Livro;
import com.projections.domain.projection.ProjecaoBibliotecaDTOSpringDataJPaRepository;
import com.projections.domain.projection.dto.BibliotecaDTOInterfaceProjection;
import com.projections.domain.projection.dto.BibliotecaDTOInterfaceProjection2;
import com.projections.domain.projection.dto.LivroDTO;
import com.projections.domain.projection.dto.LivroDTO2;
import com.projections.domain.projection.dto.ProjecaoAutorDTOAninhadoSpringDataJPA;
import com.projections.domain.projection.dto.ProjecaoAutorDTOSpringDataJPARepository;
import com.projections.domain.projection.dto.ProjecaoBibliotecaDTOSpringDataJPa;
import com.projections.domain.projection.dto.ProjecaoLivroDTOSpringDataJPARepository;
import com.projections.domain.projection.entity.ProjecaoEntidadeSpringDataJPA;

@RestController
@RequestMapping("/projections")
public class ProjectionsController {

	@Autowired
	private ProjecaoLivroDTOSpringDataJPARepository projecaoLivro;
	
	@Autowired
	private ProjecaoAutorDTOSpringDataJPARepository projecaoAutor;
	
	@Autowired
	private ProjecaoBibliotecaDTOSpringDataJPaRepository projecaoBiblioteca;
	
	@Autowired
	private ProjecaoEntidadeSpringDataJPA projecaoBiliotecaEntidade;
	
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
		
		return projecaoLivro.listarLivros().stream().map(livroDTO -> {
			Livro livro = new Livro();
			livro.setNome(livroDTO.getNome());
			livro.setPaginas(livroDTO.getPaginas());
			return livro;
		}).toList();
	}
	
	
	@GetMapping("/livros/search")
	public List<LivroDTO> listarLivrosPorNome(@RequestParam("nome") String nome) {
		return projecaoLivro.findByNome(nome);
		//return projecao.getByNome(nome);
	}
	
	@GetMapping("/livros/dto/{nome}")
	public LivroDTO buscarLivrosPorNome(@PathVariable String nome) {
		return projecaoLivro.queryByNome(nome, LivroDTO.class);
	}
	
	@GetMapping("/livros/dto2/{nome}")
	public LivroDTO2 buscarLivrosPorNome2(@PathVariable String nome) {
		return projecaoLivro.queryByNome(nome, LivroDTO2.class);
	}
	
	
	@GetMapping("/autores/search")
	public ProjecaoAutorDTOAninhadoSpringDataJPA buscarAutorPorId(@RequestParam("nome") String nome) {
		
		ProjecaoAutorDTOAninhadoSpringDataJPA autor =  projecaoAutor.getByNome(nome);
		
		return autor;
	}
	
	@GetMapping("/bibliotecas/entidades/{nome}")
	public List<Biblioteca> listarBibliotecasPorNome(@PathVariable String nome) {
		return projecaoBiliotecaEntidade.findByNomeContainingIgnoreCase(nome);
	}
	
	@GetMapping("/bibliotecas/dto/{nome}")
	public BibliotecaDTOInterfaceProjection listarBibliotecasDTOPorNome(@PathVariable String nome) {
		return projecaoBiliotecaEntidade.findByNome(nome, BibliotecaDTOInterfaceProjection.class);
	}
	
	@GetMapping("/bibliotecas/dto2/{nome}")
	public BibliotecaDTOInterfaceProjection2 listarBibliotecasDTOPorNome2(@PathVariable String nome) {
		return projecaoBiliotecaEntidade.findByNome(nome, BibliotecaDTOInterfaceProjection2.class);
	}
	
	
	@GetMapping("/bibliotecas/search")
	public List<ProjecaoBibliotecaDTOSpringDataJPa> listarBibliotecas(@RequestParam("nome") String nome) {
		return projecaoBiblioteca.getByNome(nome);
	}
}
