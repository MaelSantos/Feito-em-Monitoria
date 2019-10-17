package exemplo1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
	private int a =10;
	
	public static void main(String[] args) {
		/*// CLASS INTERNA DE INSTÂNCIA
		App a = new App();
		a.new ClassInterna().method();
		*/
		
		// CLASS STATIC
		new App.ClassInterna().method();
		
		// CLASS INTERNA ANÔNIMA(TIPO INTERNO ANÔNIMO)
		
		ClassInterna ci = new ClassInterna() {
			@Override
			void method() {
				System.out.println(this.a + 10);
			}
		};
		
		
		
	}
	
	static class  ClassInterna{
		protected int a  =20;
		
		void method() {
			System.out.println(this.a);
		}
		
	}
	
}
