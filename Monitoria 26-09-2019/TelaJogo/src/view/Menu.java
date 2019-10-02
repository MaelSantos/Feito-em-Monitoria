package view;

import javax.swing.JButton;

public class Menu extends PanelGenerico{

	private JButton btnFase, btnAjuda, btnSair;
	
	public Menu(int largura, int altura, String titulo) {
		super(largura, altura, titulo);
		
		btnFase = new JButton("Fase"); 
		btnAjuda = new JButton("Ajuda");
		btnSair = new JButton("Sair");;
		
		add(btnFase);
		add(btnAjuda);
		add(btnSair);
		
	}

	public JButton getBtnFase() {
		return btnFase;
	}

	public JButton getBtnAjuda() {
		return btnAjuda;
	}

	public JButton getBtnSair() {
		return btnSair;
	}

}
