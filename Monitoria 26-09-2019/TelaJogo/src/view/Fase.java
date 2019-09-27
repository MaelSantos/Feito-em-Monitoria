package view;

import javax.swing.JButton;

public class Fase extends PanelGenerico{

	private JButton btnVoltar;
	
	public Fase(String titulo) {
		super(titulo);
		
		btnVoltar = new JButton("Voltar");
		add(btnVoltar);
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

}
