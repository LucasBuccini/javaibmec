package RevisaoProva;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Veiculo {
	private int id;
	private String Marca;
	private String modelo;
	private String placa;
	private int ano;
	private int numero_portas;
	private String tipo_combustivel;
	private ArrayList<Locacao> locacoes;
	
	
	public Veiculo() {};
	
	public Veiculo(int id, String marca, String modelo, String placa, int ano, int numero_portas,
			String tipo_combustivel) {
		super();
		this.id = id;
		Marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.numero_portas = numero_portas;
		this.tipo_combustivel = tipo_combustivel;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMarca() {
		return Marca;
	}



	public void setMarca(String marca) {
		Marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public int getNumero_portas() {
		return numero_portas;
	}



	public void setNumero_portas(int numero_portas) {
		this.numero_portas = numero_portas;
	}



	public String getTipo_combustivel() {
		return tipo_combustivel;
	}



	public void setTipo_combustivel(String tipo_combustivel) {
		this.tipo_combustivel = tipo_combustivel;
	}

	

	public ArrayList<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(ArrayList<Locacao> locacoes) {
		this.locacoes = locacoes;
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, placa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return id == other.id && Objects.equals(placa, other.placa);
	}

	public static void printVeiculos(HashSet<Veiculo> veiculos) {
		System.out.println("-----------------VEICULOS-----------------");
		for(Veiculo v: veiculos) {
			System.out.println("------------------------------------------");
			System.out.println("Id: " + v.getId());
			System.out.println("Marca: "+ v.getMarca());
			System.out.println("Modelo: "+v.getModelo());
			System.out.println("Placa: "+v.getPlaca());
			System.out.println("Ano: "+v.getAno());
			System.out.println("Numero de Portas: "+ v.getNumero_portas());
			System.out.println("Tipo de Combustivel: "+v.getTipo_combustivel());
			
		}
	}
	
	public static void buscarPlaca(HashSet<Veiculo> veiculos, String placa) {
		for(Veiculo v: veiculos) {
			if(placa == v.getPlaca()) {
				System.out.println("------------------------------------------");
				System.out.println("Id: " + v.getId());
				System.out.println("Marca: "+ v.getMarca());
				System.out.println("Modelo: "+v.getModelo());
				System.out.println("Placa: "+v.getPlaca());
				System.out.println("Ano: "+v.getAno());
				System.out.println("Numero de Portas: "+ v.getNumero_portas());
				System.out.println("Tipo de Combustivel: "+v.getTipo_combustivel());
			}
		}
	}
}
