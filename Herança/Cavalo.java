package pacoteJava;

public class Cavalo extends Animal{

	private String corPelagem;
	private float kilos;
	
	public Cavalo(String nome,int idade,String corPelagem,float kilos)
	{
		super(nome,idade);
		this.corPelagem= corPelagem;
		this.kilos = kilos;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()
		+"\nCor da pelagem: "+corPelagem+"\nPeso: "+kilos);
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}

	public float getKilos() {
		return kilos;
	}

	public void setKilos(float kilos) {
		this.kilos = kilos;
	}
	
}
