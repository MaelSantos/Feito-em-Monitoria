package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaGenerica extends JFrame{

	public TelaGenerica(int largura, int altura) {
		
		setTitle("Monitoria 30-09-2019");//titulo
		setSize(largura, altura);//tamanho
		setLocationRelativeTo(null);//localiza��o
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//a��o ao fechar janela
//		setLayout(new BorderLayout());//layout padr�o
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
//		setLayout(new GridLayout(4, 2));
//		setLayout(new GridBagLayout());
		
		setResizable(false);
//		setUndecorated(true);
		
		setVisible(false); //sempre no final
	}
	
}
