package pacoteJava;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		String n;
		double sal;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o seu nome: ");
		n = leia.nextLine();
		System.out.println("Entre com o valor do seu salário: ");
		sal = leia.nextFloat();
		
		Funcionario func1 = new Funcionario(n,sal,x,0);
		
		func1.imprimir();
		System.out.println("Quantas horas você trabalhou?");
		x = leia.nextInt();
		func1.calculoExtras(x);
		func1.print();
	}

}
