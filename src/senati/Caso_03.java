package senati;

import java.util.Scanner;

public class Caso_03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("FACTORIAL DE UN NÚMERO");
		System.out.print("INGRESE NÚMERO: ");
		int num=sc.nextInt();
		
		int fact=1, i=1;
		if ((num<=7 && num>=1)) {
			while (i<=num) {
				fact *= i;
				if (i==num) {
					System.out.print(i+" = "+fact);
				}else{
					System.out.print(i+" * ");
				}
				i++;
			}
			System.out.println("\n"+num+"! = "+fact);
		}else{
			System.out.println("VALOR SUPERIOR A 7 O MENOR A 1");
		}

	}
}