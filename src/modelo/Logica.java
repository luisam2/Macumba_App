package modelo;

import java.util.ArrayList;

public class Logica {

	ArrayList<Usuario> usuarios;
	ArrayList<Producto> productos;

	public Logica() {
		super();
		usuarios = new ArrayList<>();
		productos = new ArrayList<>();
		
		productos.add(new Producto("Ceviche", "30", 0, ""));
		productos.add(new Producto("Arroz atollado", "25", 1, ""));
		productos.add(new Producto("Casuela de marriscos", "40", 2, ""));
		productos.add(new Producto("Empanadas de camaron", "10", 3, ""));
		
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
