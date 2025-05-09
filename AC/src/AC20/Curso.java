package AC20;
import java.util.HashSet;
import java.util.Set;
public class Curso {
    private int id;
    private String nome;
    private Set<Aluno> alunos;

    public Curso(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.alunos = new HashSet<>();
    }
    public boolean adicionarAluno(Aluno aluno) {
        return alunos.add(aluno);
    }
    public boolean removerAluno(int matricula) {
        return alunos.removeIf(a -> a.getMatricula() == matricula);
    }
    public Aluno buscarAluno(int matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                return a;
            }
        }
        return null;
    }
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno matriculado.");
        } else {
            for (Aluno a : alunos) {
                System.out.println(a);
            }
        }
    }
}