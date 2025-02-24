package AC8;
import java.util.Scanner;
public class Ac8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		String nome;
		int quantidade, escolha;
		escolha=0;
		do {
			System.out.print("Digite o nome do produto: ");
			nome = teclado.nextLine();
			System.out.print("Digite a quantidade do produto: ");
			quantidade= teclado.nextInt();
			System.out.print("Digite 1: adicionar produto ao estoque \nDigite 2: remover um imtem do estoque "
					+ "\nDigite 3: exibir estoque atual \nDigite 4: para sair ");
			escolha = teclado.nextInt();
			if(escolha ==1) {
				System.out.println("Produto adicionado");
				System.out.printf("%s : %d\n",nome,quantidade+1);
			}else if(escolha ==2) {
				System.out.println("Produto removido");
				System.out.printf("%s : %d\n",nome,quantidade-1);
			}else if(escolha==3) {
				System.out.printf("%s : %d\n",nome,quantidade);
			}else {
				escolha=4;
			}
			teclado.nextLine();
		}while(escolha!=4);
	}

}
