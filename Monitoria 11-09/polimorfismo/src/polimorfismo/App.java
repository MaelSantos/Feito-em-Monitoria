package polimorfismo;

public class App {

	public static void main(String[] args) {
		//caso 1
		Professor professor = new Professor("GodAb", 21, -10);
		professor.falar("metal");
		//caso 2
		Pessoa professor2 = new Professor("Jubilleu", 41,312312);
		professor2.falar("metal");
		
		professor.falar("Não sou formal", "Vao catar ...");
	}
	
}
