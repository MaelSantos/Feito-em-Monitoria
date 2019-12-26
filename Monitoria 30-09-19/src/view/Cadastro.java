package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Cadastro extends TelaGenerica{

	private JTextField tfdLogin;
	private JPasswordField tfdSenha, tfdConfirmar;
	private JLabel lblLogin, lblSenha, lblConfirmar;
	private JButton btnCadastrar;
	
	public Cadastro(int largura, int altura) {
		super(largura, altura);
		
		tfdLogin = new JTextField(10);
		tfdSenha = new JPasswordField(10);
		tfdConfirmar = new JPasswordField(10);
		
		lblLogin = new JLabel("Login:"); 
		lblSenha = new JLabel("Senha:");
		lblConfirmar = new JLabel("Confirmar Senha:");
		
		btnCadastrar = new JButton("Cadastrar");
		
		add(lblLogin);
		add(tfdLogin);
		add(lblSenha);
		add(tfdSenha);
		add(lblConfirmar);
		add(tfdConfirmar);
		add(btnCadastrar);
	}

	public JTextField getTfdLogin() {
		return tfdLogin;
	}

	public JPasswordField getTfdSenha() {
		return tfdSenha;
	}

	public JPasswordField getTfdConfirmar() {
		return tfdConfirmar;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}
	
}
