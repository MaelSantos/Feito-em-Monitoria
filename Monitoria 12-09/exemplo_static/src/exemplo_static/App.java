package exemplo_static;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		
		ArrayList<Loja> lojas  = new ArrayList<Loja>();
		lojas.add(new Loja("Loja 1"));
		lojas.add(new Loja("Loja 2"));
		
		Franquia franquia = new Franquia();
		franquia.setLojas(lojas);
		
		Calendar c = Calendar.getInstance();
		
		Date dateInicio = new Date();
		c.setTime(dateInicio);
		c.add(Calendar.DAY_OF_MONTH, -1);
		dateInicio = c.getTime();
		
				
		Date dateFim = new Date();
		c.setTime(dateFim);
		c.add(Calendar.DAY_OF_MONTH, 3);
		dateFim = c.getTime();
		
		System.out.println(dateInicio);
		System.out.println(dateFim);
		
		Loja loja1 = lojas.get(0);
		System.out.println(loja1.vender(100));
		Loja.setPromocao(new Promocao(0.5f, dateInicio, dateFim, "Promoção da semana premiada"));
		System.out.println(loja1.vender(100));
	}
	
}
