package modelVO;

import java.util.Calendar;
import java.util.Date;

public class Produto {

	private String nome;
	private int quantidade;
	private double valor;
	private boolean perecivel;
	private Date validade;

	public Produto(String nome, int quantidade, double valor, boolean perecivel, Date validade) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.perecivel = perecivel;
		this.validade = validade;
	}

	public Produto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", valor=" + valor + ", perecivel=" + perecivel
				+ ", validade=" + validade + "]";
	}

}
