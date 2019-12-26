package view;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaGenerica extends JFrame{

<<<<<<< HEAD
	public static final int LARGURA = 800;
	public static final int ALTURA = 500;
	
=======
>>>>>>> 1dcb39b67883daf6012bd99e865d85865b3b9772
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
