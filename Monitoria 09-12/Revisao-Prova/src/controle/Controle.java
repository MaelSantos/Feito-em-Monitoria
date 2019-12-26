package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import modelBO.Validador;
import modelDAO.BancoDados;
import modelVO.CampoVazioException;
import modelVO.Produto;
import view.Mensagem;
import view.TelaCadastro;

public class Controle implements ActionListener {

	private TelaCadastro cadastro;

	public Controle(TelaCadastro cadastro) {
		this.cadastro = cadastro;
		cadastro.getBtnOk().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();

		if (cadastro.getBtnOk() == o) {

			try {
				Validador.validarCampo(cadastro);

				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Date validade = format.parse(cadastro.getFtfValidade().getText());
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(validade);

				Produto produto = new Produto(cadastro.getTfdNome().getText(),
						Integer.parseInt(cadastro.getTfdQuant().getText()),
						Double.parseDouble(cadastro.getTfdValor().getText()), cadastro.getRdbPerecivel().isSelected(),
						calendar.getTime());

				if (BancoDados.addProduto(produto))
					Mensagem.exibirMensagem("Produto Adicionado Com Sucesso");
				else
					Mensagem.exibirMensagem("Falha ao Adicionar Produto");

			} catch (CampoVazioException e2) {
				Mensagem.exibirMensagem(e2.getMessage());
			} catch (ParseException e1) {
				Mensagem.exibirMensagem("Erro na Data!!! Informe Data Valida");
			} catch (NumberFormatException e1) {
				Mensagem.exibirMensagem("Valor Incorreto!!! Digite Um Número");
			}

		}

	}

}
