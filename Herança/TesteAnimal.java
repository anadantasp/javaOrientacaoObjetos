package pacoteJava;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro = new Cachorro("Chewie",6,"Yorkshire","Agitado");
		Cavalo cavalo = new Cavalo("Bala no Alvo",12,"Marrom",200);
		Preguica preguica = new Preguica("Flecha",9,3);
		Animal animal = null;
		
		int op;
		String som=null;
		
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			System.out.println("\t\t\tMenu de Opções");
			System.out.println("\nEscolha um animal:");
			System.out.println("\n1-Cachorro");
			System.out.println("\n2-Cavalo");
			System.out.println("\n3-Preguiça");
			System.out.println("\n0-Sair");
			op = leia.nextInt();
			 
			switch (op)
			{
			case 1: animal = cachorro;
			case 2: animal = cavalo;
			case 3: animal = preguica;
			default: System.out.println("\nErro inesperado...");
				
			}
			
			
		}while (op!=0);
	}
       
}
