package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Tela;

public class Controle implements ActionListener {

	private Tela tela;

	public Controle(Tela tela) {
		super();
		this.tela = tela;

		tela.getMenu().getBtnAjuda().addActionListener(this);
		tela.getMenu().getBtnIniciar().addActionListener(this);
		tela.getMenu().getBtnSair().addActionListener(this);
		tela.getFase().getBtnVoltar().addActionListener(this);
		tela.getAjuda().getBtnVoltar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();

		if (obj == tela.getMenu().getBtnIniciar()) {
			tela.mudarTela("f");
		}
		else if (obj == tela.getMenu().getBtnAjuda()) {
			tela.mudarTela("a");
		}
		else if (obj == tela.getMenu().getBtnSair()) {
			System.exit(0);
		}
		else if (obj == tela.getFase().getBtnVoltar()) {
			tela.mudarTela("m");
		}
		else if (obj == tela.getAjuda().getBtnVoltar()) {
			tela.mudarTela("m");
		}

	}

}
