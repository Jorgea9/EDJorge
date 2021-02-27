package Ejercicio1;

public class Motor {

	private int id;
	private String tipoMotor;
	private String potencia;
	
	
	public Motor(int id, String tipoMotor, String potencia) {
		super();
		this.id = id;
		this.tipoMotor = tipoMotor;
		this.potencia = potencia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	
}
