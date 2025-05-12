package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Aluno {
	private int id;
	private String nome;
	private String registro;
	private String cpf;
	private String email;
	private String telefone;
	
	public Aluno() {}
	public Aluno(int id, String nome, String registro, String cpf, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.registro = registro;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
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
	
	public static ArrayList<Aluno> buscarTodosAlunos(){
		
		String url = "jdbc:sqlite:universidade.db";
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		String sql = "SELECT * FROM Aluno";
		
		try {
			
			Connection conn  = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String registro = rs.getString("numero_registro");
				String cpf = rs.getString("cpf");
				String email = rs.getString("email");
				String telefone = rs.getString("telefone");
				Aluno aluno = new Aluno(id,nome,registro,cpf,email,telefone);
				listaAlunos.add(aluno);
			}
		}catch(SQLException e){
			System.out.println("Erro ao tentar buscar aluno" + e.getMessage());
		}
		return listaAlunos;
		
	}
	
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", registro=" + registro + ", cpf=" + cpf + ", email=" + email
				+ ", telefone=" + telefone + "]";
	}
	
	
	
}
