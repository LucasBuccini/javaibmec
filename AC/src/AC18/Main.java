package AC18;
public class Main {
    public static void main(String[] args) {
        double[] notasPadrao = {8.0, 7.5, 9.0};
        Aluno aluno1 = new Aluno("Ana Silva", "2023001", notasPadrao, 15);
        Curso cursoPadrao = new cursoPadrao("Matemática");

        exibirRelatorio(cursoPadrao, aluno1);

        double[] notasAvancado = {6.0, 9.0, 8.0};
        Aluno aluno2 = new Aluno("João Lima", "2023002", notasAvancado, 5);
        Curso cursoAvancado = new cursoAvancado("Engenharia de Software");

        exibirRelatorio(cursoAvancado, aluno2);
    }
    public static void exibirRelatorio(Curso curso, Aluno aluno) {
        double media = curso.calcularMedia(aluno);
        boolean aprovado = curso.alunoAprovado(aluno);

        System.out.println("-------- RELATÓRIO DO ALUNO --------");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Registro: " + aluno.getRegistro());
        System.out.println("Curso: " + curso.nome);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Faltas: " + aluno.getFaltas());
        System.out.println("Situação: " + (aprovado ? "Aprovado" : "Reprovado"));
        System.out.println("-------------------------------------\n");
    }
}