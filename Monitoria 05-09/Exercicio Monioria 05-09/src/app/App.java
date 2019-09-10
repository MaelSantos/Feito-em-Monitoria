package app;

public class App {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("mael", "mael7", "111");
		
		System.out.println(Base.addUsuario(usuario));
		System.out.println(Base.removeUsuario("mael77"));
		
	}
	
}
