package view;

import javax.swing.JButton;

public class Ajuda extends PanelGenerico{

	private JButton btnVoltar;
	
	public Ajuda(int largura, int altura, String titulo) {
		super(largura, altura, titulo);
		
		btnVoltar = new JButton("Voltar");
		add(btnVoltar);
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

}
