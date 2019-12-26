package modelDAO;

import java.util.ArrayList;

import modelBO.Validador;
import modelVO.Produto;

public class BancoDados {
	
	private static Xml xml = new Xml();
	private static ArrayList<Produto> produtos = xml.ler();
	
	public static boolean addProduto(Produto produto) {
		if(Validador.validarProduto(produto))//verifica se esta vencido
			return produtos.add(produto);
		return false;
	}
	
	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
}
