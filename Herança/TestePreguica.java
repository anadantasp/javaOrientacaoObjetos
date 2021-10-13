package pacoteJava;

import java.util.Scanner;

public class TestePreguica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade;
		int numeroDedos;
		Animal animal;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o nome: ");
		nome = leia.nextLine();
		System.out.println("Entre com a idade: ");
		idade = leia.nextInt();
		System.out.println("Quantos dedos na mão tem a sua preguiça: ");
		numeroDedos = leia.nextInt();
		
		Preguica preguica1 = new Preguica(nome,idade,numeroDedos);
		preguica1.numeroDedos();
		animal = preguica1;
		animal.som(1);
		animal.funcao(1);
		
	
		
		
	}
	

}
