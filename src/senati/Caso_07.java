package senati;

import java.util.Scanner;

public class Caso_07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("INGRESE NOMBRE: ");
		String nombre=sc.nextLine();
		
		int veces = 10; // cantidad de veces de mensaje
		String ind = "%02d";
		
		for (int i=1; i<=veces; i++)
			System.out.println(String.format(ind, i)+". Bienvenido al curso, "+nombre);

	}
}