package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Proogram {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//criando uma lista de produto onde recebera todos os tipos de produtos
		//seja comum, importado ou usado - polimorfismo
		List<Produto> lista = new ArrayList<>();

		System.out.println("Entre com o núemro de produtos:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do Produto" + i +":");
			System.out.println("Comum, Usado ou Importado(c/u/i)?");
			sc.nextLine();
			char tipo = sc.next().charAt(0);
			System.out.println("Nome:");
			sc.nextLine();
			String nomeProd = sc.nextLine();
			System.out.println("Preço:");
			Double preco = sc.nextDouble();
			if(tipo =='i') {
				System.out.println("Taxa de alfândega:");
				Double taxa = sc.nextDouble();
				//instancio
				ProdutoImportado imp = new ProdutoImportado(nomeProd,preco,taxa);
				//adiciono na lista
				lista.add(imp);
			}
			else {
				if(tipo =='u') {
					System.out.println("Data de Fabricação:");
					Date datafab = sdf.parse(sc.next());
					//instancio
					ProdutoUsado usado = new ProdutoUsado(nomeProd,preco,datafab);
					//adiciono na lista
					lista.add(usado);
				}
				else {
					//instancio
					Produto prod = new Produto(nomeProd,preco);
					////adiciono na lista
					lista.add(prod);
				}
			}
			
		}
		System.out.println("Etiquetas de preço: \n");
		for (Produto p : lista) {
			//chama o metodo etiquetapreco de produto 
			// se for outro tipo de produto ele chama o metodo sobreposto
			System.out.println(p.etiquetaPreco() + "\n");
		}
		
	}

}
