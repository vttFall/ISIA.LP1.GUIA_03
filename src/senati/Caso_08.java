package senati;

import java.util.Scanner;

public class Caso_08 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("INGRESE NÚMERO ENTERO: ");
		int n1=sc.nextInt();
		
		int n2 = 15; // cantidad de multiplicador
		String ind = "%02d";
		
		for (int i=1; i<=n2; i++)
			System.out.println(n1 + " * "+String.format(ind, i)+" = "+ (n1*i));

	}
}
