package app;

public class Usuario extends Pessoa{

	private String login;
	private String senha;
	
	public Usuario(String nome, String login, String senha) {
		super(nome);
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Usuario) {
			Usuario usuario = (Usuario) obj;
			if(usuario.login.equals(login)){
				return true;
			}
		}
		
		return super.equals(obj);
	}
	
}
