package monitoria;

public abstract class Pessoa implements Humano{

	String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
	@Override
	public void falar() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract void andar();
	
	
}
