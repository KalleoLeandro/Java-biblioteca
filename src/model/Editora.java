package model;

/**
 * Classe do objeto Editora
 * 
 * @author Kalleo Leandro dos Santos Leal
 * @since 18/02/2021
 */

public class Editora {
	// Atributos do objeto Editora

	private int codigo;

	private String nome;

	private String pais;

	// Construtor do objeto Editora

	public Editora() {

	}

	// Getters e Setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
