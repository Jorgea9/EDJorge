package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		do {
			System.out.println("Introduce un n�mero entre 1 y 12:");
			num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				System.out.println("Enero tiene 31 d�as.");
				break;
			case 2:
				System.out.println("Febrero tiene 28 d�as.");
				break;
			case 3:
				System.out.println("Marzo tiene 31 d�as.");
				break;
			case 4:
				System.out.println("Abril tiene 30 d�as.");
				break;
			case 5:
				System.out.println("Mayo tiene 31 d�as.");
				break;
			case 6:
				System.out.println("Junio tiene 30 d�as.");
				break;
			case 7:
				System.out.println("Julio tiene 31 d�as.");
				break;
			case 8:
				System.out.println("Agosto tiene 31 d�as.");
				break;
			case 9:
				System.out.println("Septiembre tiene 30 d�as.");
				break;
			case 10:
				System.out.println("Octubre tiene 31 d�as.");
				break;
			case 11:
				System.out.println("Noviembre tiene 30 d�as.");
				break;
			case 12:
				System.out.println("Diciembre tiene 31 d�as.");
				break;
			}

		} while (num < 1 || num > 12);

		sc.close();
	}
}
