package entities;

public class AluguelDeQuarto
{
	private String nome;
	private String email;
	//private byte numeroDoQuarto;
	
	
	
	public AluguelDeQuarto(String nome, String email) 
	{
		this.nome = nome;
		this.email = email;
		//this.numeroDoQuarto = numeroDoQuarto;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}

	
	public String toString() 
	{
		return "Nome:" + nome
				+" Email:" + email;
	}
	
	
	
}
