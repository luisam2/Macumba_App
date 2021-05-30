package vista;

import modelo.Producto;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class VistaProducto {
	
	private PApplet app;
	private int posX;
	private int posY;
	private int tamX;
	private int tamY;
	private int tipo;
	private Producto producto;
	private PImage img;

	public VistaProducto(Producto producto, int tipo, int posX, int posY, int tamX, int tamY,  PApplet app) {
		super();
		this.producto = producto;
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		this.tipo = tipo;
	}
	
	public VistaProducto(Producto producto, int tipo, int posX, int posY, int tamX, int tamY,  PApplet app, PImage img) {
		super();
		this.producto = producto;
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		this.tipo = tipo;
		this.img = img;
	}
	
	public void pintar() {
		this.app.imageMode(PConstants.CENTER);
		this.app.rectMode(PConstants.CENTER);
		this.app.textAlign(PConstants.CENTER, PConstants.CENTER);
		switch (this.tipo) {
		case 0:
			if(isHover()) {
				this.app.fill(180);
				this.app.rect( posX, posY, tamX, tamY);
				this.app.fill(0);
				this.app.textSize(14);
				this.app.text(this.producto.getName(), posX + 5, posY+ tamY/9);
				this.app.textSize(16);
				this.app.text(this.producto.getPrice(), posX + 5, posY+ tamY/4);
			} else {
				this.app.fill(220);
				this.app.rect( posX, posY, tamX, tamY);
				this.app.fill(0);
				this.app.textSize(14);
				this.app.text(this.producto.getName(), posX + 5, posY+ tamY/9);
				this.app.textSize(16);
				this.app.text(this.producto.getPrice(), posX + 5, posY+ tamY/4);
			}
			
			break;
		case 1:
			if(isHover()) {
				
			} else {
				
			}
			break;
		case 2:
			break;

		}
		
		
	}
	
	public boolean isHover() {
		boolean isSobre = false;

		if (	this.app.mouseX > (this.posX - (this.tamX / 2)) && 
				this.app.mouseX < (this.posX + (this.tamX / 2)) && 
				this.app.mouseY > (this.posY - (this.tamY / 2)) && 
				this.app.mouseY < (this.posY + (this.tamY / 2))) {
					isSobre = true;
		}
		return isSobre;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTamX() {
		return tamX;
	}

	public void setTamX(int tamX) {
		this.tamX = tamX;
	}

	public int getTamY() {
		return tamY;
	}

	public void setTamY(int tamY) {
		this.tamY = tamY;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public PImage getImg() {
		return img;
	}

	public void setImg(PImage img) {
		this.img = img;
	}
}
