package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDeDados;
import model.Usuario;
import view.Tela;

public class Controle implements ActionListener{

	private Tela tela;

	public Controle(Tela tela) {
		this.tela = tela;
		
		//informa onde será feito o tratamento do evento
		tela.getBtnOk().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == tela.getBtnOk()) {
			
			Usuario usuario = new Usuario(tela.getTfdLogin().getText(), tela.getTfdSenha().getText());
			
			if(BaseDeDados.isUsuario(usuario))
			{
				JOptionPane.showMessageDialog(null, "Logado");
			}
			else {
				JOptionPane.showMessageDialog(null, "Usuário não cadastrado!!!");
			}
			
		}
		
	}
	
	
	
}
