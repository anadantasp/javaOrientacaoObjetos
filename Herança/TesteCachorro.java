package pacoteJava;

import java.util.Scanner;

public class TesteCachorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade;
		String comportamento;
		String tipo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o nome do seu animal: ");
		nome = leia.nextLine();
		System.out.println("Informe a idade do seu animal: ");
		idade = leia.nextInt();
		System.out.println("Informe a raça do seu animal: ");
		tipo = leia.next();
		System.out.println("Informe o comportamento do seu animal: ");
		comportamento = leia.next();
	
		
		
		Cachorro seuCachorro = new Cachorro(nome,idade,tipo,comportamento);
		seuCachorro.imprimirInfo();
	}

}
