package modelo;

import java.util.ArrayList;

public class Logica {

	ArrayList<Usuario> usuarios;

	public Logica() {
		super();
		usuarios = new ArrayList<>();
	}
	
	public void addUser(String usuario, String contraseņa) {
		usuarios.add(new Usuario(usuario, contraseņa));
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
