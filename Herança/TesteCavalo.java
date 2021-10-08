package pacoteJava;

import java.util.Scanner;

public class TesteCavalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String nome;
        int idade;
        String cor;
        float peso;
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Entre com o nome do cavalo: ");
        nome = leia.next();
        System.out.println("Entre com a idade: ");
        idade = leia.nextInt();
        System.out.println("Entre a cor do pelo: ");
        cor = leia.next();
        System.out.println("Entre o peso: ");
        peso = leia.nextFloat();
        
        Cavalo cavalo1 = new Cavalo (nome,idade,cor,peso);
        cavalo1.imprimirInfo();
        
	}

}
