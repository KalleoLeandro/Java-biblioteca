package model;

/**
 * Classe do objeto Livro
 * 
 * @author Kalleo Leandro dos Santos Leal
 * @since 18/02/2021
 */
public class Livro {

	//Construtor do objeto Livro
	
	public Livro() {

	}
	
	// Atributos do objeto Livro
	private int codigo;
	private String titulo;
	private Editora editora;
	private Autor autor;
	private int anoPublicacao;
	private boolean disponivel;

	// Getters e setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public String disponibilidade(boolean valor)
	{
		if(valor==true)
		{
			return "Sim";
		}
		return "Não";
	}

	//String customizada	
	@Override
	public String toString() 
	{	
		return   "Código             : " + codigo
		    +  "\nTítulo             : " + titulo
		    +  "\nEditora            : " + editora.getNome()
		    +  "\nAutor              : " + autor.getNome()
		    +  "\nAno de Publicação  : " + anoPublicacao
		    +  "\nDisponibilidade    : " + disponibilidade(disponivel);
	}
	
}
