package view;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PanelGenerico extends JPanel{

	public PanelGenerico(String titulo) {
		
		setSize(TelaGenerica.LARGURA, TelaGenerica.ALTURA);
//		setLocation(0, 0);
		
//		setBounds(0, 0, TelaGenerica.LARGURA, TelaGenerica.ALTURA);
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		setBorder(BorderFactory.createTitledBorder(titulo));
		setVisible(false);
		
	}
	
}
