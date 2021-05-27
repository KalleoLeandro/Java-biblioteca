package model;

/**
 * Classe do objeto Locacao
 * @author Kalleo Leandro dos Santos Leal
 * @since 18/02/2021
 */

public class Locacao 
{
	//Atributos do objeto Locacao
	private int codigo;
	private Data dataLocacao;
	private Data dataDevolucao;
	private Livro livros[];
	private Usuario usuario;
	
	//Construtor do objeto Locacao
	
	public Locacao()
	{
		
	}
	
	//Getters e Setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Data getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Data dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public Data getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Data dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Livro[] getLivros() {
		return livros;
	}

	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
}
