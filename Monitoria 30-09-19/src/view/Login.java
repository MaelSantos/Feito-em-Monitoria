package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends TelaGenerica{

	private JTextField tfdLogin;
	private JPasswordField tfdSenha;
	private JLabel lblLogin, lblSenha;
	private JButton btnOk;
	
	public Login(int largura, int altura) {
		super(largura, altura);
		
		tfdLogin = new JTextField(10);
		tfdSenha = new JPasswordField(10);
		
		lblLogin = new JLabel("Login:"); 
		lblSenha = new JLabel("Senha:");
		
		btnOk = new JButton("OK");
		
		//adiciona os componentes na tela (jframe)
		add(lblLogin);
		add(tfdLogin);
		add(lblSenha);
		add(tfdSenha);
		add(btnOk);
		
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
