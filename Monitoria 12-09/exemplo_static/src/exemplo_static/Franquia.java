package exemplo_static;

import java.util.ArrayList;

public class Franquia {

	public ArrayList<Loja> lojas ;
	
	public Franquia() {
		lojas = new ArrayList<>();
	}

	public ArrayList<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(ArrayList<Loja> lojas) {
		this.lojas = lojas;
	}
	
}
