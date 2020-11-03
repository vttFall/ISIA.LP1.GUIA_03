package senati;

import java.util.Scanner;

public class Caso_05 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("INGRESE #1: ");
		int num=sc.nextInt();
		int menor=num;

		int i=2, cantidad=5;
		while (i<=cantidad) {
			System.out.print("INGRESE #"+i+": ");
			num=sc.nextInt();
			if (num<menor) {
				menor=num;
			}
			i++;
		}
		System.out.println("EL MENOR # ES: "+menor);
		
	}
}