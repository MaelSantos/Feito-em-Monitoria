package app;

public class Filha extends Pai{

	public Filha(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void me() {
		System.out.println("Filha");
	}
	
}
