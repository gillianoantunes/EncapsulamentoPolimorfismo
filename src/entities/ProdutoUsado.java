package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	private Date dataFabricacao;

	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nomeProd, Double preco, Date dataFabricacao) {
		super(nomeProd, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiquetaPreco() {
		return super.etiquetaPreco() +" (Data de Fabricação: " + sdf1.format(getDataFabricacao())+")";
	}
}
