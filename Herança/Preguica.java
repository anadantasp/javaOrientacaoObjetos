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
			System.out.println("\nSua Pregui�a � do g�nero Choloepus");
		}
		if(quantidadeDedos==3)
		{
			System.out.println("\nSua Pregui�a � do g�nero Bradypus");
		}
	}
	
	@Override
	public void som (int numVezes)
	{
		for(int i=0;i<numVezes;i++)
		{
			System.out.println("\nEmitindo ru�do");
		}
	}
	
	@Override
	public void funcao (int numVezes)
	{
		for(int i=0;i<numVezes;i++)
		{
			System.out.println("\nEst� subindo na �rvore");
		}
	}

	public int getQuantidadeDedos() {
		return quantidadeDedos;
	}

	public void setQuantidadeDedos(int quantidadeDedos) {
		this.quantidadeDedos = quantidadeDedos;
	}
	
	

}
