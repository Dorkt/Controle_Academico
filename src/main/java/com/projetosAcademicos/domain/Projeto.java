package com.projetosAcademicos.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "projeto")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "titulo_do_projeto")
	private String tituloProjeto;
	
	@Column(name = "nome")
	private String nome;
	
	@NotNull()
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_professor_id", foreignKey = @ForeignKey(name = "fk_professor"), referencedColumnName = "id")
	private Professor professorResponsavel;
	
	@Column(name = "area_do_projeto")
	private String areaDoProjeto;
	
	@Column(name = "resumo")
	private String resumo;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTituloProjeto() {
		return tituloProjeto;
	}

	public void setTituloProjeto(String tituloProjeto) {
		this.tituloProjeto = tituloProjeto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessorResponsavel() {
		return professorResponsavel;
	}

	public void setProfessorResponsavel(Professor professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}

	public String getAreaDoProjeto() {
		return areaDoProjeto;
	}

	public void setAreaDoProjeto(String areaDoProjeto) {
		this.areaDoProjeto = areaDoProjeto;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getPalavraChave1() {
		return palavraChave1;
	}

	public void setPalavraChave1(String palavraChave1) {
		this.palavraChave1 = palavraChave1;
	}

	public String getPalavraChave2() {
		return palavraChave2;
	}

	public void setPalavraChave2(String palavraChave2) {
		this.palavraChave2 = palavraChave2;
	}

	public String getPalavraChave3() {
		return palavraChave3;
	}

	public void setPalavraChave3(String palavraChave3) {
		this.palavraChave3 = palavraChave3;
	}

	public String getUrlDocumento() {
		return urlDocumento;
	}

	public void setUrlDocumento(String urlDocumento) {
		this.urlDocumento = urlDocumento;
	}

	@Column(name = "palavra_chave_1")
	private String palavraChave1;
	
	@Column(name = "palavra_chave_2")
	private String palavraChave2;
	
	@Column(name = "palavra_chave_3")
	private String palavraChave3;
	
	@Column(name = "url_documento")
	private String urlDocumento;
	
}
