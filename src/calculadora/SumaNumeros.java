package calculadora;

import java.util.Scanner;

/**
 * Suma simple que se encarga de realizar operaciones de suma
 * 
 * 	 * Metodo principal que inicia el programa
	 * <p> Este metodo se encarga de pedir 2 numeros al usuario para despues poder realizar la suma de estos
	 * @param args
	 
 * 
 * @author ciclesgs
 * @version 1.0
 */

public class SumaNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		int numero1 = scanner.nextInt();
		System.out.print("Ingresa el segundo número: ");
		int numero2 = scanner.nextInt();
		int suma = numero1 + numero2;
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
		
		//El programa se encarga de darnos la suma de 2 numeros que hayamos ingrersado con anterioridad
		
		//Cambio realizado desde feature-suma
		
		//Comentario despues de realizar fusion entre ramas
	}
}


