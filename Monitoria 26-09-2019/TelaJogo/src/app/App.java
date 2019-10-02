package app;

import controller.Controle;
import view.Tela;

public class App {

	public static void main(String[] args) {
		
		Tela tela = new Tela(200, 200);
		new Controle(tela);
	}

}
