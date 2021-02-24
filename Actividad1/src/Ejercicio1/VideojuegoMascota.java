package Ejercicio1;

import Ejercicio2.Mascota;

public class VideojuegoMascota {

	public static void main(String[] args) {
		
		
		Mascota mascota = new Mascota("paco", "rojo", 545151);
	
		System.out.println(mascota);
		
		Videojuego videojuego = new Videojuego(5220, "Renekton", "sonic");
		
		System.out.println(videojuego);
	}
}
