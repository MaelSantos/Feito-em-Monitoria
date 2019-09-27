package app;

import controller.Controle;
import model.BaseDeDados;
import model.Usuario;
import view.Tela;

public class App {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("mael", "123");
		BaseDeDados.addUsuario(usuario);
		
		Tela tela = new Tela();
		new Controle(tela);
	}

}
