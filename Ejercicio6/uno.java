package Ejercicio6;
import java.util.Scanner;
public class uno {
	public static void main(String [ ] args) {
	Scanner sc = new Scanner(System.in);
	
	float nota1, nota2;
	System.out.println("Primera nota:");
	nota1 = sc.nextInt();
	
	System.out.println("Segunda nota:");
	nota2 = sc.nextInt();
	
	float sumaNotas = nota1 + nota2;
	float notaMedia = sumaNotas/2;
	
	System.out.println("La nota media es: " + notaMedia);
	
    
	}
}
