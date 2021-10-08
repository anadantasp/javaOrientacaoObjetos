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
	

	public int getQuantidadeDedos() {
		return quantidadeDedos;
	}

	public void setQuantidadeDedos(int quantidadeDedos) {
		this.quantidadeDedos = quantidadeDedos;
	}
	
	

}
