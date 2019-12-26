package modelBO;

import java.util.Date;

import modelVO.CampoVazioException;
import modelVO.Produto;
import view.TelaCadastro;

public class Validador {

	public static boolean validarProduto(Produto produto) {

		Date validade = produto.getValidade();
		// data atual de acordo com a data do PC
		Date atual = new Date(System.currentTimeMillis());

		if (validade.after(atual))
			return true;
		return false;

	}

	public static void validarCampo(TelaCadastro cadastro) throws CampoVazioException {
		
		if(cadastro.getTfdNome().getText().isEmpty() ||
				cadastro.getTfdQuant().getText().isEmpty() ||
				cadastro.getTfdValor().getText().isEmpty() ||
				cadastro.getFtfValidade().getText().isEmpty() ||
				(
				!cadastro.getRdbNaoPerecivel().isSelected() &&
				!cadastro.getRdbPerecivel().isSelected()
				)
				)
			throw new CampoVazioException("Campos Vazios!!!");
		
	}

}
