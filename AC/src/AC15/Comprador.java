package AC15;

public class Comprador {
	private String nome;
	private String cpf;
	Ingresso ingresso;


	public Comprador() {}
	
	public Comprador(String nome, String cpf) {
		this.nome = nome;
		this.cpf= cpf;
	}
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
	
	public Ingresso getIngresso() {
		return ingresso;
	}

	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}
	
}
