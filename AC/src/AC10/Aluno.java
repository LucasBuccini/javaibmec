package AC10;

public class Aluno {
	private String nome;
    private String matricula;
    private double avaliacao1, avaliacao2, avaliacaoC, avaliacaoS;
    private double media;
    private boolean status;

    public Aluno(String nome2, String matricula2) {
		// TODO Auto-generated constructor stub
	}

	public void Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNotas(double avaliacao1, double avaliacao2, double avaliacaoC) {
        this.avaliacao1 = avaliacao1;
        this.avaliacao2 = avaliacao2;
        this.avaliacaoC = avaliacaoC;
        calcularMedia();
    }

    public void setAvaliacaoSubstitutiva(double avaliacaoS) {
        this.avaliacaoS = avaliacaoS;
        substituirMenorNota();
    }

    private void calcularMedia() {
        this.media = (avaliacao1 * 4 + avaliacao2 * 4 + avaliacaoC * 2) / 10;
        this.status = this.media >= 7;
    }

    private void substituirMenorNota() {
        if (media < 7) {
            if (avaliacao1 < avaliacao2) {
                avaliacao1 = avaliacaoS;
            } else {
                avaliacao2 = avaliacaoS;
            }
            calcularMedia();
        }
    }

    public double getMedia() {
        return media;
    }

    public String getStatus() {
        return status ? "Aprovado" : "Reprovado";
    }

    public void imprimirResultado() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Nota A1: " + avaliacao1);
        System.out.println("Nota A2: " + avaliacao2);
        System.out.println("Nota AC: " + avaliacaoC);
        if (avaliacaoS != 0) {
            System.out.println("Nota AS: " + avaliacaoS);
        }
        System.out.println("Média Final: " + media);
        System.out.println("Status: " + getStatus());
    }
}