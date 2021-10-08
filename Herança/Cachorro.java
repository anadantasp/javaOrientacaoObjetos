package pacoteJava;

public class Cachorro extends Animal{

	private String raca;
	private String comportamento;
	
	public Cachorro (String nome,int idade,String raca,String comportamento)
	{
		super(nome,idade);
		this.raca = raca;
		this.comportamento = comportamento;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal: "+getNome()+"\nIdade: "+getIdade()+"\nRaça: "+raca+"\nComportamento: "+comportamento);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}
	
}
