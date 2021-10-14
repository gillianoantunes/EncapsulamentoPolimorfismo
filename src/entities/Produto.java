package entities;
public class Produto {
	private String nomeProd;
	private Double preco;
	
	
	public Produto() {
		
	}
	public Produto(String nomeProd, Double preco) {
		this.nomeProd = nomeProd;
		this.preco = preco;
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String etiquetaPreco() {
		return getNomeProd() +" $"+ getPreco();
	}
	
}
