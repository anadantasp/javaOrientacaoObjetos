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
	

	public int getQuantidadeDedos() {
		return quantidadeDedos;
	}

	public void setQuantidadeDedos(int quantidadeDedos) {
		this.quantidadeDedos = quantidadeDedos;
	}
	
	

}
