package Ejercicio4; //Decimos que pertenece al pack Ejercicio4
import java.util.Scanner; 
public class uno {
	public static void main(String [ ] args) {
	Scanner sc = new Scanner(System.in);
	
	//Variable en formato int que indica los años
	int añoActual, añoNacimiento;
	
	//Pide año actual
	System.out.println("¿En qué año nos encontramos?"); 
	añoActual = sc.nextInt();
	
	//Pide año de nacimiento
	System.out.println("¿En qué año naciste?"); 
	añoNacimiento = sc.nextInt();
	 int edad = añoActual - añoNacimiento; //Calculo de la edad
	
	//Exportamos el resultado con su texto
	System.out.println("Entonces tu edad actual es de " + edad + " años"); 	
	}
}
