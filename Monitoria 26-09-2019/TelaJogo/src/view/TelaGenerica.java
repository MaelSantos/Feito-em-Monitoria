package view;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaGenerica extends JFrame{

	public static final int LARGURA = 270;
	public static final int ALTURA = 130;
	
	private CardLayout cardLayout;
	
	public TelaGenerica(String titulo, int largura, int altura) {
		super(titulo); //modifica o titulo
		setSize(largura, altura);
		inicializar();
	}
	
	public TelaGenerica(String titulo) {
		super(titulo);//modifica o titulo
		setSize(LARGURA, ALTURA);
		inicializar();
	}
	
	public void inicializar()
	{
		cardLayout = new CardLayout();
		setLayout(cardLayout);
		
//		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
//		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}

	public void mudarTela(String tela)
	{
		cardLayout.show(getContentPane(), tela);
	}
}
