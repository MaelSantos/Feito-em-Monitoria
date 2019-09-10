package app;

import java.util.ArrayList;

public class Base {

	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	
	public static boolean addUsuario(Usuario usuario){
		
//		for (Usuario u : usuarios) {
//			if(u.equals(usuario))
//			{
//				return false;
//			}
//		}
		
		if(usuarioExi(usuario)){
			return false;
		}
		
		usuarios.add(usuario);			
		return true;
	}
	
	public static boolean removeUsuario(Usuario usuario){
		return usuarios.remove(usuario);
	}
	
	public static boolean removeUsuario(String login){
		
		for (Usuario u : usuarios) {
			if(u.getLogin().equals(login)){
				return usuarios.remove(u);
			}
		}
		return false;
	}
	
	public static boolean usuarioExi(Usuario usuario){
		return usuarios.contains(usuario);
	}
}
