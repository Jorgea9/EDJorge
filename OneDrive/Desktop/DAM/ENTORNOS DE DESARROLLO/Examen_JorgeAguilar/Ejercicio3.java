package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número de trabajadores de la empresa:");
		int cantidad = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce el precio de cada hora trabajada:");
		int precioHora = Integer.parseInt(sc.nextLine());

		int horasTrabajo = 0;
		int sueldoSem = 0;
		int costeTotal = 0;

		for (int i = 1; i <= cantidad; i++) {
			System.out.println("Introduce las horas trabajadas del trabajador " + i + ":");
			horasTrabajo = Integer.parseInt(sc.nextLine());

			sueldoSem = horasTrabajo * precioHora;
			costeTotal = costeTotal + sueldoSem;

			System.out.println("El trabajador " + i + " tiene un sueldo semanal de " + sueldoSem);
		}

		System.out.println("El total de dinero que pagó la empresa por los " + cantidad + " empleados es: " + costeTotal);

		sc.close();
	}
}
