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
	
	@Override
	public void som (int numVezes)
	{
		for(int i=0;i<numVezes;i++)
		{
			System.out.println("\nO cavalo está relinchando!");
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
