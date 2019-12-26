package view;

import java.awt.FlowLayout;
import java.awt.Label;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame {

	private JTextField tfdNome, tfdQuant, tfdValor;
	private JRadioButton rdbPerecivel, rdbNaoPerecivel;
	private JFormattedTextField ftfValidade;
	private JButton btnOk;

	public TelaCadastro() {
		super("Cadastro Produto");

		tfdNome = new JTextField(10);
		tfdQuant = new JTextField(10);
		tfdValor = new JTextField(10);

		rdbPerecivel = new JRadioButton("Perecível");
		rdbNaoPerecivel = new JRadioButton("Não Perecível");
		ButtonGroup group = new ButtonGroup();

		group.add(rdbPerecivel);
		group.add(rdbNaoPerecivel);

		try {
			MaskFormatter mask = new MaskFormatter("##/##/#### ##:##:##");
//			ftfValidade = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"));
			ftfValidade = new JFormattedTextField(mask);
			ftfValidade.setColumns(10);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		btnOk = new JButton("Ok");

		add(new Label("Nome: "));
		add(tfdNome);
		add(new Label("Quantidade: "));
		add(tfdQuant);
		add(new Label("Valor: "));
		add(tfdValor);
		add(new Label("Validade: "));
		add(ftfValidade);
		add(rdbPerecivel);
		add(rdbNaoPerecivel);
		add(btnOk);

		setSize(150, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public JButton getBtnOk() {
		return btnOk;
	}

	public JTextField getTfdNome() {
		return tfdNome;
	}

	public JTextField getTfdQuant() {
		return tfdQuant;
	}

	public JTextField getTfdValor() {
		return tfdValor;
	}

	public JRadioButton getRdbPerecivel() {
		return rdbPerecivel;
	}

	public JRadioButton getRdbNaoPerecivel() {
		return rdbNaoPerecivel;
	}

	public JFormattedTextField getFtfValidade() {
		return ftfValidade;
	}

}
