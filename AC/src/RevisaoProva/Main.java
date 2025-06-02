package RevisaoProva;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int escolha=10;
		String placa, cpf;
		HashSet<Veiculo> veiculos = new HashSet<>();
		HashSet<Cliente> clientes = new HashSet<>();
		ArrayList<Locacao> locacoes = new ArrayList<>();
		Veiculo v1 = new Veiculo(1, "Honda", "Honda Bomba", "OPZ7398", 2010, 4, "Flex");
		Veiculo v2 = new Veiculo(2, "Fiat", "Argo", "TCZ7398", 2025, 4, "Flex");
		Veiculo v3 = new Veiculo(3, "Volks", "Polo", "SCP3198", 2024, 4, "Flex");
		Cliente c1 = new Cliente(1, "Joao", "111.111.111-11", "joao@gmail.com", "(31) 99999 9999");
		Cliente c2 = new Cliente(1, "Neves", "222.222.222-22", "nevao@gmail.com", "(31) 99929 9999");
		Cliente c3 = new Cliente(1, "Marcello", "333.333.333-33", "marcello@gmail.com", "(31) 99939 9999");
		Locacao l1 = new Locacao(1, "10/03/2020", "10/04/2020", 300.00, v1, c1);
		Locacao l2 = new Locacao(2, "11/04/2021", "10/06/2021", 300.00, v2, c2);
		Locacao l3 = new Locacao(3, "20/06/2024", "20/08/2024", 400.00, v3, c3);
		locacoes.add(l1);
		locacoes.add(l2);
		locacoes.add(l3);
		veiculos.add(v1);
		veiculos.add(v2);
		veiculos.add(v3);
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		do{
			System.out.println("=================MENU==================");
			System.out.println("0. Sair");
			System.out.println("1. Buscar todos os veiculos");
			System.out.println("2. Buscar veiculo por placa");
			System.out.println("3. Cadastrar novo veiculo");
			System.out.println("4. Buscar cliente por cpf");
			System.out.println("5. Cadastrar novo cliente");
			System.out.println("6. Cadastrar locacao");
			System.out.println("=======================================");
			System.out.print("Qual a sua escolha: ");
			escolha = sc.nextInt();
			if (escolha == 0) {
				break;
			}
			if (escolha == 1) {
				Veiculo.printVeiculos(veiculos);
			}
			if(escolha == 2) {
				sc.nextLine();
				System.out.print("Qual a placa do veiculo: ");
				placa = sc.nextLine();
				for(Veiculo v: veiculos) {
					if(v.getPlaca().equals(placa)) {
						System.out.println("------------------------------------------");
						System.out.println("Id: " + v.getId());
						System.out.println("Marca: "+ v.getMarca());
						System.out.println("Modelo: "+v.getModelo());
						System.out.println("Placa: "+v.getPlaca());
						System.out.println("Ano: "+v.getAno());
						System.out.println("Numero de Portas: "+ v.getNumero_portas());
						System.out.println("Tipo de Combustivel: "+v.getTipo_combustivel());
					}
				}
			}
			if(escolha == 3) {
				Veiculo v = new Veiculo();
				System.out.print("Id: ");
				v.setId(sc.nextInt());
				sc.nextLine();
				System.out.print("Marca: ");
				v.setMarca(sc.nextLine());
				System.out.print("Modelo: ");
				v.setModelo(sc.nextLine());
				System.out.print("Placa: ");
				v.setPlaca(sc.nextLine());
				System.out.print("Ano: ");
				v.setAno(sc.nextInt());
				System.out.print("Numero de Portas: ");
				v.setNumero_portas(sc.nextInt());
				sc.nextLine();
				System.out.print("Tipo de Combustivel: ");
				v.setTipo_combustivel(sc.nextLine());
				veiculos.add(v);
			}
			if(escolha == 4) {
				sc.nextLine();
				System.out.print("Qual o cpf do cliente: ");
				cpf = sc.nextLine();
				for(Cliente c: clientes) {
					if(c.getCpf().equals(cpf)) {
						System.out.println("------------------------------------------");
						System.out.println("Id: "+c.getId());
						System.out.println("Nome: "+c.getNome());
						System.out.println("Cpf: "+c.getCpf());
						System.out.println("Email: "+ c.getEmail());
						System.out.println("Telefone: "+c.getTelefone());
					}
				}
			}
			if(escolha ==5) {
				Cliente c = new Cliente();
				System.out.print("Id: ");
				c.setId(sc.nextInt());
				sc.nextLine();
				System.out.print("Nome: ");
				c.setNome(sc.nextLine());
				System.out.print("Cpf: ");
				c.setCpf(sc.nextLine());
				System.out.print("Email: ");
				c.setEmail(sc.nextLine());
				System.out.print("Telefone: ");
				c.setTelefone(sc.nextLine());
				clientes.add(c);
			}
			if(escolha == 6) {
				Locacao l = new Locacao();
				System.out.println("Id: ");
				l.setId(sc.nextInt());
				System.out.println("Data de Inicio: ");
				l.setData_inicio(sc.nextLine());
				System.out.println("Data do Fim: ");
				l.setData_fim(sc.nextLine());
				System.out.println("Valor: ");
				l.setValor(sc.nextDouble());
				int idv;
				System.out.println("Qual o id do veiculo: ");
				idv = sc.nextInt();
				for(Veiculo v: veiculos) {
					if(idv == v.getId()) {
						l.setVeiculo(v);
					}
				}
				int idc;
				System.out.println("Qual o id do cliente: ");
				idc = sc.nextInt();
				for(Cliente c: clientes) {
					if (idc == c.getId()) {
						l.setCliente(c);
					}
				}
				
				
			}
		}while (escolha!=0); 
	}

}
