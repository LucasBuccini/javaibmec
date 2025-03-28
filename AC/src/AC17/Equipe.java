package AC17;

import java.util.ArrayList;

public class Equipe {
	
	private String nome;
	private String cor;
	private ArrayList<Jogador> jogadores;
	
	public Equipe() {
		this.jogadores = new ArrayList<Jogador>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public ArrayList<Jogador> getJogador() {
		return jogadores;
	}

	public void setJogador(ArrayList<Jogador> jogador) {
		this.jogadores = jogador;
	};
	
	public void addJogador(Jogador jogador) {
		jogadores.add(jogador);
		jogador.addEquipe(this);
	}
	
}
