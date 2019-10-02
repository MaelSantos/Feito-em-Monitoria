package app;

import controller.Controle;
import model.BaseDeDados;
import model.Usuario;
import view.Cadastro;
import view.Login;

public class App {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("mael", "123");
		BaseDeDados.addUsuario(usuario);
		
		Login tela = new Login(200, 200);
		Cadastro cadastro = new Cadastro(150, 300);
		
		tela.setVisible(true);
		cadastro.setVisible(true);
		new Controle(tela, cadastro);
	}

}
