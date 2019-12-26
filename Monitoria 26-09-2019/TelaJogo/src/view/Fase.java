package view;

import javax.swing.JButton;

public class Fase extends PanelGenerico{

	private JButton btnVoltar;
	
	public Fase(int largura, int altura, String titulo) {
		super(largura, altura, titulo);
		
		btnVoltar = new JButton("Voltar");
		add(btnVoltar);
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

}
