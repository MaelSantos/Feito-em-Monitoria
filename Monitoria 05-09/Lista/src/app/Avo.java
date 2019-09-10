package app;

public class Avo implements A, B{

	private String nome;
	private String cpf;
	
	public Avo(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public void me(){
		System.out.println("Avo");
	}
	
	@Override
	public void va() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Avo) {
			Avo a = (Avo) obj;
			if(a.cpf.equals(this.cpf))
			{
				return true;
			}
		}
		
		return super.equals(obj);
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}
	
}
