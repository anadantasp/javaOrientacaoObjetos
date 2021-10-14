package pacoteJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner leia = new Scanner (System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n------------------------------------------------");
			System.out.println("\n\t\tMenu de Opções");
			System.out.println("\n------------------------------------------------");
			System.out.println("\n[1]-Deseja adicionar produtos ao estoque?");
			System.out.println("\n[2]-Deseja remover produtos do estoque?");
			System.out.println("\n[3]-Deseja atualizar produtos do estoque?");
			System.out.println("\n[4]-Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n[0]-Deseja sair do programa?");
			System.out.println("\nDigite uma opção: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2: 
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else 
				{
					System.out.println("\nProduto não existe no estoque");
				}
				break;
			case 3: 
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do "+verifica+" :");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existente no estoque");
				}
				break;
			
			case 4: 
				leia.nextLine();
				System.out.println("\n\nProdutos do estoque: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("Finalizou o programa");
				
			}
		}
		while(op!=0);
		
		
		
	}

}
