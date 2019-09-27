package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame{

	private JTextField tfdLogin, tfdSenha;
	private JLabel lblLogin, lblSenha;
	private JButton btnOk;
	
	public Tela() {

		setTitle("Monitoria 25-09-2019");//titulo
		setSize(200, 200);//tamanho
		setLocationRelativeTo(null);//localização
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//ação ao fechar janela
//		setLayout(new BorderLayout());//layout padrão
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
//		setLayout(new GridLayout(4, 2));
//		setLayout(new GridBagLayout());
		
//		setResizable(false);
//		setUndecorated(true);
		
		tfdLogin = new JTextField(10);
		tfdSenha = new JTextField(10);
		
		lblLogin = new JLabel("Login:"); 
		lblSenha = new JLabel("Senha:");
		
		btnOk = new JButton("OK");
		
		//adiciona os componentes na tela (jframe)
		add(lblLogin);
		add(tfdLogin);
		add(lblSenha);
		add(tfdSenha);
		add(btnOk);
		
		setVisible(true); //sempre no final
		
	}

	public JTextField getTfdLogin() {
		return tfdLogin;
	}

	public JTextField getTfdSenha() {
		return tfdSenha;
	}

	public JButton getBtnOk() {
		return btnOk;
	}
	
}
