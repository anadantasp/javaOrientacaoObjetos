package pacoteJava;

public class Cliente {
	private String nome;
	private String endereco;
	private String CPF;
	private String telefone;
	
	public Cliente (String nome,String endereco, String CPF,String telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.CPF = CPF;
		this.telefone = telefone;
				
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nCliente: "+nome+"\nEndereço: "+endereco+"\nCPF: "+CPF+"\nTelefone: "+telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
