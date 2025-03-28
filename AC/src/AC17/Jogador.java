package AC17;

import java.util.ArrayList;

public class Jogador {
	
	private String nome;
	private int idade;
	private ArrayList<Equipe> equipes;
	
	public Jogador() {
		this.equipes = new ArrayList<Equipe>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public ArrayList<Equipe> getEquipe() {
		return equipes;
	}

	public void setEquipe(ArrayList<Equipe> equipe) {
		this.equipes = equipe;
	};
	
	public void addEquipe(Equipe equipe) {
		equipes.add(equipe);
	}

}
