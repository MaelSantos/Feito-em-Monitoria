package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDeDados;
import model.Usuario;
import view.Cadastro;
import view.Login;
import view.Mensagem;

public class Controle implements ActionListener{

	private Login login;
	private Cadastro cadastro;

	public Controle(Login tela, Cadastro cadastro) {
		this.login = tela;
		this.cadastro = cadastro;
		
		//informa onde será feito o tratamento do evento
		tela.getBtnOk().addActionListener(this);
		cadastro.getBtnCadastrar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource(); //informa qual objeto esta sendo clicado
		
		if(obj == login.getBtnOk()) {
			
			Usuario usuario = new Usuario(login.getTfdLogin().getText(), login.getTfdSenha().getText());
			
			if(BaseDeDados.isUsuario(usuario))
			{
				Mensagem.exibirMensagem("Logado");
			}
			else {
				Mensagem.exibirMensagem("Usuário não cadastrado!!!");
			}
			
		}
		else if(obj == cadastro.getBtnCadastrar())
		{
			if(cadastro.getTfdSenha().getText().equals(cadastro.getTfdConfirmar().getText()))
			{
				Usuario usuario = new Usuario(
						cadastro.getTfdLogin().getText().trim(), 
						cadastro.getTfdSenha().getText().trim());
				
				if(BaseDeDados.addUsuario(usuario))
					Mensagem.exibirMensagem("Usuario cadastrado com sucesso");
				else
					Mensagem.exibirMensagem("Usuario já cadastrado");
				
			}
			
		}
		
	}
	
	
	
}
