package RevisaoProva;

public class Locacao {
	
	private int id;
	private String data_inicio;
	private String data_fim;
	private double valor;
	private Veiculo veiculo;
	private Cliente cliente;
	
	
	public Locacao() {}
	
	
	
	public Locacao(int id, String data_inicio, String data_fim, double valor, Veiculo veiculo, Cliente cliente) {
		super();
		this.id = id;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.valor = valor;
		this.veiculo = veiculo;
		this.cliente = cliente;
	}



	public Locacao(int id, String data_inicio, String data_fim, double valor) {
		super();
		this.id = id;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.valor = valor;
	}
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}
	public String getData_fim() {
		return data_fim;
	}
	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
