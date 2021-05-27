package model;

/**
 * Classe do objeto Autor
 * 
 * @author Kalleo Leandro dos Santos Leal
 * @since 18/02/2021
 */

public class Autor {
	// Construtor do objeto Autor
	public Autor() 
	{

	}
		
	// Atributos do objeto Autor
	private int codigo;
	private String nome;
	private String nacionalidade;	

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

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

}
