package AC15;

public class Ingresso {
	private int num;
	private String descricao;
	
	public Ingresso() {}
	public Ingresso(int num, String descricao) {
		this.num = num;
		this.descricao = descricao;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
