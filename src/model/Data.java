package model;

/**
 * Classe para os atributos do objeto Data
 * @author Kalleo Leandro dos Santos Leal
 * @since 18/02/2021
 */

public class Data 
{
	//Atributos do objeto Data
	private int dia;
	private int mes;
	private int ano;
	
	public Data()
	{
		
	}
	
	//Getters e Setters

	public int getDia() 
	{
		return dia;
	}

	public void setDia(int dia) 
	{
		this.dia = dia;
	}

	public int getMes() 
	{
		return mes;
	}

	public void setMes(int mes) 
	{
		this.mes = mes;
	}

	public int getAno() 
	{
		return ano;
	}

	public void setAno(int ano) 
	{
		this.ano = ano;
	}

	//String customizada
	
	@Override
	public String toString() 
	{
		
		return dia+"/"+mes+"/"+ano;
	}
	
	
}
