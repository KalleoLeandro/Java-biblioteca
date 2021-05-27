package model;

/**
 * Classe do objeto Usuario
 * @author Kalleo Leandro dos Santos Leal
 * @since 18/02/2021
 */

public class Usuario 
{
	//Atributos do objeto Usuario
	private int codigo;
	private String nome;
	private Data dataNascimento;
	private String telefone;
	private String email;
	
	//Construtor do objeto Usuario
	
	public Usuario()
	{
		
	}

	//Getters e Setters
	
	
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

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	

	//String customizada
	
	@Override
	public String toString() 
	{	
		return "Código          : " + codigo +
			 "\nNome            : " + nome +
			 "\nData Nascimento : " + dataNascimento.toString() +
			 "\nEmail           : " + email +
			 "\nTelefone        : " + telefone;
	}
}