package Ejercicio1;


public class Coche {

<<<<<<< HEAD
	private int km;
=======
	private Motor motor;
>>>>>>> motor
	private int id;
	private String matricula;
	private String modelo;
	private String marca;
	
<<<<<<< HEAD
	public Coche(int km, int id, String matricula, String modelo, String marca) {
		super();
		this.km = km;
=======
	
	public Coche(int id, String matricula, String modelo, String marca) {
		super();
>>>>>>> motor
		this.id = id;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
<<<<<<< HEAD
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
=======
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
>>>>>>> motor
	
}
