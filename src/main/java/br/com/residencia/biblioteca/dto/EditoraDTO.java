package br.com.residencia.biblioteca.dto;

public class EditoraDTO {

	public EditoraDTO() {

	}

	private Integer codigoEditora;
	private String nome;

	public EditoraDTO(Integer codigoEditora, String nome) {
		super();
		this.codigoEditora = codigoEditora;
		this.nome = nome;
	}

	public Integer getCodigoEditora() {
		return codigoEditora;
	}

	public void setCodigoEditora(Integer codigoEditora) {
		this.codigoEditora = codigoEditora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
 /*package carro;

public class CarroDto {

	private String nomeModelo;
	private String numAssentos;

	public CarroDto(String nomeModelo, String numAssentos) {
		super();
		this.nomeModelo = nomeModelo;
		this.numAssentos = numAssentos;
	}

	public String getNomeModelo() {
		return nomeModelo;
	}

	public void setNomeModelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}

	public String getNumAssentos() {
		return numAssentos;
	}

	public void setNumAssentos(String numAssentos) {
		this.numAssentos = numAssentos;
	}

}*/