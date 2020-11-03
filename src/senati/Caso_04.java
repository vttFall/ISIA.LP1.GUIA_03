package senati;

import java.util.Scanner;

public class Caso_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0, i=1, n_mayor=0;
		
		while (i <= 4) {
			System.out.print("INGRESE NÚMERO "+i+": ");
			n=sc.nextInt();
			
			if (n > n_mayor) 
				n_mayor = n;
			i++;
		}
		
		System.out.println("\nRESULTADOS");
		System.out.println("==========");
		System.out.println("EL # MAYOR ES: "+n_mayor);

	}
}