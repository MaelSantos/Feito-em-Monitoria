package exemplo2_mvc.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame{

	private static final long serialVersionUID = 806985780248117949L;

	private JButton cadastrarBtn, cancelarBtn;
	
	private JTextField nomeFld, cpfFld, idadeFld;

	public Tela(){
		this.cadastrarBtn = new JButton("Cadastrar");
		this.cancelarBtn = new JButton("Cancelar");
		this.nomeFld = new JTextField(10);
		this.cpfFld = new JTextField(10);
		this.idadeFld = new JTextField(10);
		
		add(new JLabel("Nome*"));
		add(nomeFld);
		add(new JLabel("CPF*"));
		add(cpfFld);
		add(new JLabel("Idade"));
		add(idadeFld);
		add(cancelarBtn);
		add(cadastrarBtn);
		
		setLayout(new FlowLayout());
		setSize(202,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JButton getCadastrarBtn() {
		return cadastrarBtn;
	}

	public JButton getCancelarBtn() {
		return cancelarBtn;
	}

	public JTextField getNomeFld() {
		return nomeFld;
	}

	public JTextField getCpfFld() {
		return cpfFld;
	}

	public JTextField getIdadeFld() {
		return idadeFld;
	}	
	
}
