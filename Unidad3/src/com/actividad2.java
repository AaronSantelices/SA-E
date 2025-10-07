package com;
import java.util.Scanner;
public class actividad2 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int edad,alum,mayorEdad,sumaEdad;
		float mediaEdad;
		alum= 0;
		mayorEdad = 0;
		mediaEdad= 0;
		sumaEdad= 0;
		
		do {System.out.println("Dime las edades: ");
			edad = sc.nextInt();
			if(edad >=0) {
				alum++;
				sumaEdad += edad;
				mediaEdad = sumaEdad / alum;
			}
			if(edad >18) {
				mayorEdad++;
			}
		}while(edad >= 0);
		System.out.println("La suma de edades es: " + sumaEdad + ".");
		System.out.println("La media de las edades es: " + mediaEdad + ".");
		System.out.println("El total de alumnos es: " + alum + ".");
		System.out.println("Los alumnos mayores de edad son: " + mayorEdad + ".");
		
		
		
		
		
		
		
			
		}
	}

