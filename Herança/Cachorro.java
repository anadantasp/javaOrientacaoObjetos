package pacoteJava;

public class Cachorro extends Animal{
	//Atirbutos
	private String raca;
	private String comportamento;
	//Construtor
	public Cachorro (String nome,int idade,String raca,String comportamento)
	{
		super(nome,idade);
		this.raca = raca;
		this.comportamento = comportamento;
	}
	//Métodos
	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal: "+getNome()+"\nIdade: "+getIdade()+"\nRaça: "+raca+"\nComportamento: "+comportamento);
	}
	
	
	@Override
	public void som (int numVezes)
	{
		for(int i=0;i<numVezes;i++)
		{
			System.out.println("\nAuau Auau Auau");
		}
	}
	
	@Override
	public void funcao (int numVezes)
	{
		for(int i=0;i<numVezes;i++)
		{
			System.out.println("\nEstá correndo");
		}
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
