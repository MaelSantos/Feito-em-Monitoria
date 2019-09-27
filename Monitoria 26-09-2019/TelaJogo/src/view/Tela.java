package view;

public class Tela extends TelaGenerica{

	private Menu menu;
	private Fase fase;
	private Ajuda ajuda;
	
	public Tela(String titulo) {
		super(titulo);
		init();
		setVisible(true);
	}

	public Tela(String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		init();
		setVisible(true);
	}

	public void init() {
		menu = new Menu("Menu");
		fase = new Fase("Fase");
		ajuda = new Ajuda("Ajuda");
		
		//ligando a string ao componente
		add(menu, "m");
		add(fase, "f");
		add(ajuda, "a");
		
		mudarTela("m");
	}
	
	public Menu getMenu() {
		return menu;
	}

	public Fase getFase() {
		return fase;
	}

	public Ajuda getAjuda() {
		return ajuda;
	}
	
}
