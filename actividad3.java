package com;
import java.util.Scanner;
import java.util.Random;
public class actividad3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int numSec = random.nextInt(100) + 1;
		int intento = 0;
		
		System.out.println("Adivina el número entre 1 y 100: ");
		System.out.println("<Introduce -1 para salir>");
		
		while(true) {
			System.out.println("Escribe un número:");
			intento = sc.nextInt();
			
			if(intento == -1) {
				System.out.println("Saliendo...");
				break;
			}
			if (intento == numSec) {
				System.out.println("HAS GANADO. El número era " + intento);
				break;
			}
			else if(intento > numSec) {
				System.out.println("Es menor...");
			}
			else if(intento < numSec) {
				System.out.println("Es mayor...");
			}
		}
				
	}
}
