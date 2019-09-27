package monitoria;

import java.util.ArrayList;

public class Base {

	ArrayList<Aluno> alunos = new ArrayList<>();
	
	public void add(Aluno aluno){
		
		alunos.add(new Aluno(""));
		alunos.remove(0);
		
	}
}
