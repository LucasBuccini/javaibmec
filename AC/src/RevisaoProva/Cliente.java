package RevisaoProva;

import java.util.ArrayList;
import java.util.Objects;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private ArrayList<Locacao> locacoes;
	
	public Cliente() {}
	
	
	
	
	
	public Cliente(int id, String nome, String cpf, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public ArrayList<Locacao> getLocacoes() {
		return locacoes;
	}
	public void setLocacoes(ArrayList<Locacao> locacoes) {
		this.locacoes = locacoes;
	}



	@Override
	public int hashCode() {
		return Objects.hash(cpf, id, telefone);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf) && id == other.id && Objects.equals(telefone, other.telefone);
	}
	
	
	
	
}
