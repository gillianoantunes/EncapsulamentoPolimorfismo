package entities;

public class ProdutoImportado extends Produto {
	private Double taxaAlfandega;

	
	public ProdutoImportado() {
		super();
	}


	public ProdutoImportado(String nomeProd, Double preco, Double taxaAlfandega) {
		super(nomeProd, preco);
		this.taxaAlfandega = taxaAlfandega;
	}


	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}


	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	 
	@Override
	public String etiquetaPreco() {
		//nao usei o super porque n�o preciso do pre�o e sim da soma do preco + taxa
		//por isso eu s� altero o metodo sem usar super
		return  getNomeProd() + PrecoTotal() + " (Taxa: $" + String.format("%.2f",getTaxaAlfandega())+")";
	}
	
	public Double PrecoTotal() {
		return   getPreco() + getTaxaAlfandega();
	}
	
}
