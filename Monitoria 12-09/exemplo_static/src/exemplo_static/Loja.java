package exemplo_static;

public class Loja {
	
	private static Promocao promocao;
	
	private String nome;
	
	public Loja(String nome) {
		super();
		this.nome = nome;
	}

	public String vender(float valorTotal) {
		
		if(promocao != null) {
			float novoValor = valorTotal * promocao.getPorcentagem();
			return  "------"+nome+"------\n"+
					"total venda : "+novoValor+"\n"+
					"Promoção"+promocao.getDescricao();
		}else
			return   "------"+nome+"------\n"+
					"total venda : "+valorTotal+"\n"+
					"Não há promoções no momento";
	}

	public static Promocao getPromocao() {
		return promocao;
	}

	public static void setPromocao(Promocao promocao) {
		Loja.promocao = promocao;
	}
	
}
