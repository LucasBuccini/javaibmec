package AC16;

import java.util.ArrayList;

public class Autor {
	private String nome;
	private String cpf;
	private ArrayList<Livro> livro;
	
	public Autor() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Livro> getLivro() {
		return livro;
	}

	public void setLivro(ArrayList<Livro> livro) {
		this.livro = livro;
	}
	
	
	
	
}
