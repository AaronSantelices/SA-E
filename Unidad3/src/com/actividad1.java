package com;
import java.util.Scanner;
public class actividad1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Dime un numero:");
		num = sc.nextInt();
		while (num != 0){
			int res = num * num;
			if (num % 2 == 1) {
				if (num < 0) {System.out.println("Tu número es impar, negativo y al cuadrado sería: " + res);}
				if (num > 0) {System.out.println("Tu número es impar, positivo y al cuadrado sería: " + res);}
			};
			if (num % 2 == 0) {
				if (num < 0) {System.out.println("Tu número es par, negativo y al cuadrado sería: " + res);}
				if (num > 0) {System.out.println("Tu número es par, positivo y al cuadrado sería: " + res);}
			};
		System.out.println("Dime otro numero:");
		num = sc.nextInt();
		}
		while (num == 0){
			System.out.println("ERROR, NÚMERO SIN VALOR");
			System.out.println("Dime un numero válido:");
			num = sc.nextInt();
			}	
	}
}