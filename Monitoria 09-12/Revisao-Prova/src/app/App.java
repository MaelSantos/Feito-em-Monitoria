package app;

import controle.Controle;
import modelDAO.BancoDados;
import modelDAO.Xml;
import view.TelaCadastro;

public class App extends Thread {

	private Xml xml;

	@Override
	public void run() {
		xml = new Xml();
		System.out.println(BancoDados.getProdutos());
		while (true) {

			try {
				xml.salvar(BancoDados.getProdutos());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		TelaCadastro cadastro = new TelaCadastro();
		Controle controle = new Controle(cadastro);
		new App().start();
	}

}
