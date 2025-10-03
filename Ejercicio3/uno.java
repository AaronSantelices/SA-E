package Ejercicio3;
import java.util.Scanner;
public class uno {
	public static void main(String [ ] args) {
		Scanner sc= new Scanner(System.in);
		int sumaDelAño = 1;
		int edad;
		System.out.println("¿Cúal es tu edad?");
		edad = sc.nextInt();
		int edadAñoViene = edad + sumaDelAño;
		System.out.println("El año que viene tendrás " + edadAñoViene + " años");
	}
}
