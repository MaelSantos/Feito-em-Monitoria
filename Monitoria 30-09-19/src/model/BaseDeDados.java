package model;

import java.util.ArrayList;

public class BaseDeDados {

	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static boolean addUsuario(Usuario usuario) {
		for (Usuario u : usuarios) {
			if(u.equals(usuario))
				return false;
		}
		return usuarios.add(usuario);
	}
	
	public static boolean isUsuario(Usuario usuario)
	{
		return usuarios.contains(usuario);
	}
	
}
