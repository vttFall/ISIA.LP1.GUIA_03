package senati;

import java.util.Scanner;

public class Caso_02 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("SUMATORIA DE NÚMEROS NATURALES");
		System.out.print("INGRESE NÚMERO: ");
		int num=sc.nextInt();
		
		int sumat=0, i=1;
		
		while (i<=num) {
			sumat += i;
			if (i==num) {
				System.out.print(i+" = "+sumat);
			}else{
				System.out.print(i+" + ");
			}
			i++;
		}
		
		System.out.println("\nSUMATORIA DE "+num+" PRIMEROS #s = "+sumat);
		
	}
}