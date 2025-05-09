package AC20;
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso(1, "Engenharia de Software");

        Aluno a1 = new Aluno("João", 1001);
        Aluno a2 = new Aluno("Maria", 1002);
        Aluno a3 = new Aluno("Carlos", 1001); // Matrícula duplicada

        curso.adicionarAluno(a1);
        curso.adicionarAluno(a2);
        boolean adicionado = curso.adicionarAluno(a3); // Deve retornar false

        System.out.println("Alunos do curso:");
        curso.listarAlunos();

        System.out.println("\nBuscando aluno com matrícula 1002:");
        Aluno encontrado = curso.buscarAluno(1002);
        System.out.println(encontrado != null ? encontrado : "Aluno não encontrado.");

        System.out.println("\nRemovendo aluno com matrícula 1001...");
        curso.removerAluno(1001);

        System.out.println("\nLista atualizada de alunos:");
        curso.listarAlunos();
    }
}