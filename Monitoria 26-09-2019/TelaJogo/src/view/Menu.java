package view;

import javax.swing.JButton;

public class Menu extends PanelGenerico{

	private JButton btnIniciar, btnAjuda, btnSair;
	
	public Menu(String titulo) {
		super(titulo);
		
		btnIniciar = new JButton("Iniciar");
		btnAjuda = new JButton("Ajuda"); 
		btnSair = new JButton("Sair");
		
		add(btnIniciar);
		add(btnAjuda);
		add(btnSair);
		
		setVisible(true);
	}

	public JButton getBtnIniciar() {
		return btnIniciar;
	}

	public JButton getBtnAjuda() {
		return btnAjuda;
	}

	public JButton getBtnSair() {
		return btnSair;
	}

}
