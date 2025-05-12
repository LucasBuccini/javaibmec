package app;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		alunos = Aluno.buscarTodosAlunos();
		
		for (Aluno a : alunos) {
			System.out.println(a.toString());
		}
		
		ArrayList<Disciplina> disciplinas = new ArrayList<>();
		disciplinas = Disciplina.buscarTodasDisciplinas();
		
		for (Disciplina d: disciplinas) {
			System.out.println(d.toString());
		}
	}

}
