package exemplo_static;

import java.util.Date;

public class Promocao {

	private float porcentagem;
	
	private Date dataInicio;
	
	private Date dataFim;
	
	private String descricao;

	public Promocao(float porcentagem, Date dataInicio, Date dataFim, String descricao) {
		super();
		this.porcentagem = porcentagem;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.descricao = descricao;
	}

	public float getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(float porcentagem) {
		this.porcentagem = porcentagem;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
