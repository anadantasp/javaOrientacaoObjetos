package pacoteJava;

public class Preguica extends Animal {
	private int quantidadeDedos;
	
	public Preguica(String nome, int idade,int quantidadeDedos)
	{
		super(nome,idade);
		this.quantidadeDedos = quantidadeDedos;
	}
	
	public void numeroDedos()
	{
		if(quantidadeDedos==2)
		{
			System.out.println("\nSua Preguiça é do gênero Choloepus");
		}
		if(quantidadeDedos==3)
		{
			System.out.println("\nSua Preguiça é do gênero Bradypus");
		}
	}
	
	@Override
	public void som (int numVezes)
	{
		for(int i=0;i<numVezes;i++)
		{
			System.out.println("\nEmitindo ruído");
		}
	}
	
	@Override
	public void funcao (int numVezes)
	{
		for(int i=0;i<numVezes;i++)
		{
			System.out.println("\nEstá subindo na árvore");
		}
	}

	public int getQuantidadeDedos() {
		return quantidadeDedos;
	}

	public void setQuantidadeDedos(int quantidadeDedos) {
		this.quantidadeDedos = quantidadeDedos;
	}
	
	

}
