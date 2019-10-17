package exemplo2_mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import exemplo2_mvc.view.Tela;

public class TelaController extends KeyAdapter{

	Tela tela;

	public TelaController(Tela tela) {
		this.tela = tela;
		control();
	}
	
	private void control() {
		//1 - propria class
		tela.getNomeFld().addKeyListener(this);
		tela.getCpfFld().addKeyListener(this);
		tela.getIdadeFld().addKeyListener(this);
		//2 - class interna
		tela.getCancelarBtn().addActionListener(new CancelarHandler());
		//3 - class interna anônima(Tipo interno anônimo)
		//3.1 - Criando referência
		/*ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		};
		tela.getCancelarBtn(actionListener);
		*/
		//3.2 - passando instância anônima
		tela.getCadastrarBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});
		// class Lambda (extra)
		//tela.getCadastrarBtn().addActionListener((e)->cadastrar());
		
		// como ficaria o tratamento em outra classe(outro arquivo java)?
	}
	
	public void cadastrar() {
		System.out.println("Cadastrando");
	}
	
	public static void main(String[] args) {
		new TelaController(new Tela());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER)
			cadastrar();
	}
	
	class CancelarHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			/*int resposta = JOptionPane.showConfirmDialog(
					tela, // no escopo de 
					"Realmente deseja cancelar?", // mensagem
					JOptionPane.OK_CANCEL_OPTION
				);
			JOptionPane.show*/
		}
	}
	
}
