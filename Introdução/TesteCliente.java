package pacoteJava;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente("Ana Prado","Avenida Paulista 3000","798.047.234-78","(11)5967-2133");
		
		cliente1.imprimirInfo();
		System.out.println("\n***Mudança de Endereço***");
		cliente1.setEndereco("Rua dos Pinheiros 100");
		cliente1.imprimirInfo();
		
		Cliente cliente2 = new Cliente("Diego Luccas","Alameda Barros n44","180.900.340-90","(11)98976-4531");
		cliente2.imprimirInfo();
		System.out.println("\n***Novo Número de Telefone***");
		cliente2.setTelefone("(11)96521-9845");
		cliente2.imprimirInfo();
				
	}

}
