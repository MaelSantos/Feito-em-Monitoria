package view;

import javax.swing.JButton;

public class Ajuda extends PanelGenerico{

	private JButton btnVoltar;
	
	public Ajuda(String titulo) {
		super(titulo);
		
		btnVoltar = new JButton("Voltar");
		add(btnVoltar);
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	
}
