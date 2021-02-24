package Ejercicio2;

public class Mascota {

	private String nombre;
	private String color;
	private int id;
	public Mascota(String nombre, String color, int id) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", color=" + color + ", id=" + id + "]";
	}
	
	
}
