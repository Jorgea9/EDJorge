package Ejercicio1;

public class Videojuego {
	private int id;
	private String nombre;
	private String compa�ia;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompa�ia() {
		return compa�ia;
	}
	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", compa�ia=" + compa�ia + "]";
	} 
	
	
	
}
