package view;

public class Tela extends TelaGenerica{

	private Menu menu;
	private Ajuda ajuda;
	private Fase fase;
	
	public Tela(int largura, int altura) {
		super(largura, altura);
		
		menu = new Menu(getWidth(), getHeight(), "Menu");
		ajuda = new Ajuda(getWidth(), getHeight(), "Ajuda");
		fase = new Fase(getWidth(), getHeight(), "Fase");
		
		add(menu, "m");
		add(ajuda, "a");
		add(fase, "f");
		
		menu.setVisible(true);
		setVisible(true);
		
		mudarTela("m");
//		getCardLayout().show(getContentPane(), "m");
		
	}

	public Menu getMenu() {
		return menu;
	}

	public Ajuda getAjuda() {
		return ajuda;
	}

	public Fase getFase() {
		return fase;
	}

}
