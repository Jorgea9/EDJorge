package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un n�mero:");
		int num = Integer.parseInt(sc.nextLine());

		int resultado = 0;

		if (num % 2 == 0) {
			System.out.println("El n�mero es par, se imprimir� a continuaci�n su tabla de multiplicar.");
			for (int i = 0; i <= 10; i++) {
				resultado = num * i;
				System.out.println(num + " x " + i + "= " + resultado);
			}
		} else {
			System.out.println("El n�mero es impar.");
		}

		sc.close();
	}
}
