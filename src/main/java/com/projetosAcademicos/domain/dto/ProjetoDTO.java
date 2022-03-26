package com.projetosAcademicos.domain.dto;

import com.projetosAcademicos.domain.Projeto;
import com.projetosAcademicos.domain.Professor;

import lombok.Data;

@Data
public class ProjetoDTO {
	
	private Long id;
	private String tituloProjeto;
	private Professor professorResponsavel;
	private String areaDoProjeto;
	private String resumo;
	private String palavraChave1;
	private String palavraChave2;
	private String palavraChave3;
	private String urlDocumento;
	
	public ProjetoDTO(Projeto p) {
		this.id = p.getId();
		this.tituloProjeto= p.getTituloProjeto();
		this.professorResponsavel= p.getProfessorResponsavel();
		this.areaDoProjeto= p.getAreaDoProjeto();
		this.resumo= p.getResumo();
		this.palavraChave1 = p.getPalavraChave1();
		this.palavraChave1 = p.getPalavraChave2();
		this.palavraChave1 = p.getPalavraChave3();
		this.urlDocumento = p.getUrlDocumento();
	}
}
