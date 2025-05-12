package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Disciplina {
	
	private int id;
	private String nome;
	private String sigla;
	private int carga_horaria;
	
	public Disciplina() {}
	
	public Disciplina(int id, String nome, String sigla, int carga_horaria) {
		super();
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
		this.carga_horaria = carga_horaria;
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
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(int carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	
	public static ArrayList<Disciplina> buscarTodasDisciplinas(){
		
		String url = "jdbc:sqlite:universidade.db";
		ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();
		String sql = "SELECT * FROM Disciplina";
		
		try {
			
			Connection conn  = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String sigla = rs.getString("sigla");
				int carga_horaria = rs.getInt("carga_horaria");
				Disciplina d = new Disciplina(id,nome,sigla,carga_horaria);
				listaDisciplinas.add(d);
			}
		}catch(SQLException e){
			System.out.println("Erro ao tentar buscar aluno" + e.getMessage());
		}
		return listaDisciplinas;
		
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", nome=" + nome + ", sigla=" + sigla + ", carga_horaria=" + carga_horaria
				+ "]";
	}
	
	
	
}
