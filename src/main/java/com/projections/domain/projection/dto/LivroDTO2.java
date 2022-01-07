package com.projections.domain.projection.dto;

import java.util.Objects;

public class LivroDTO2 {
	
	private Long id;
	private String nome;
	private Integer paginas;

	public LivroDTO2(Long id, Integer paginas) {
		this.id = id;
		this.paginas = paginas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LivroDTO2 other = (LivroDTO2) obj;
		return Objects.equals(id, other.id);
	}
}
