package pacoteJava;

import java.util.Scanner;

public class TestePreguica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade;
		int numeroDedos;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o nome: ");
		nome = leia.nextLine();
		System.out.println("Entre com a idade: ");
		idade = leia.nextInt();
		System.out.println("Quantos dedos na mão tem a sua preguiça: ");
		numeroDedos = leia.nextInt();
		
		Preguica preguica1 = new Preguica(nome,idade,numeroDedos);
		preguica1.numeroDedos();
		
		
	}
	

}
