package AC17;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Jogador> jogadores = new ArrayList<>();
		ArrayList<Equipe> equipes = new ArrayList<>();
		
		String opcao;
		int i = 1, escolha;
		while(i!=0) {
			Jogador j = new Jogador();
			System.out.printf("Qual o nome do jogador %d: ",i);
			j.setNome(sc.nextLine());
			System.out.printf("Qual a idade do jogador %d: ",i);
			j.setIdade(sc.nextInt());
			jogadores.add(j);	
			System.out.print("Digite 0 para sair ou 1 para continuar: ");
			escolha = sc.nextInt();
			sc.nextLine();
			if(escolha == 0) {
				break;
			}else {
				i+=1;
			}
		}
		i=1;
		while(i!=0) {
			Equipe e = new Equipe();
			System.out.printf("Qual o nome da %d° equipe: ",(i));
			e.setNome(sc.nextLine());
			System.out.printf("Qual a cor da %d° equipe: ",(i));
			e.setCor(sc.nextLine());
			System.out.print("Digite 0 para sair ou 1 para continuar: ");
			escolha = sc.nextInt();
			equipes.add(e);
			sc.nextLine();
			if(escolha == 0) {
				break;
			}else {
				i+=1;
			}
		}
		for(Jogador j: jogadores) {
			for(Equipe e: equipes) {
				System.out.printf("O(a) %s joga no: %s?\nDigite sim ou nao: ",j.getNome(),e.getNome());
				opcao = sc.nextLine();
				if(opcao.equals("sim")) {
					e.addJogador(j);
				}
			}
		}
		
		for(Equipe e: equipes) {
			System.out.println("=========================");
			System.out.println("Equipes: ");
			System.out.println("-------------------------");
			System.out.printf("Nome da equipe: %s\n",e.getNome());
			System.out.printf("Cor da equipe: %s\n",e.getCor());
			System.out.println("\n-------------------------");
			System.out.println("Jogadores: \n");
			System.out.println("-------------------------");
			for(Jogador j: e.getJogador()) {
				System.out.printf("Jogador: %s\n",j.getNome());
				System.out.printf("Idade: %d\n",j.getIdade());
				System.out.println("-------------------------");
			}
			System.out.println("=========================");
		}
		
	}

}
