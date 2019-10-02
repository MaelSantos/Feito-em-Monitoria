package view;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaGenerica extends JFrame{

	private CardLayout cardLayout;
	
	public TelaGenerica(int largura, int altura) {
		
		cardLayout = new CardLayout();
		
		setLayout(cardLayout);
		setSize(largura, altura);
		setTitle("Monitoria");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
	public void mudarTela(String tela)
	{
		cardLayout.show(getContentPane(), tela);
	}
	
	public CardLayout getCardLayout() {
		return cardLayout;
	}
	
}
