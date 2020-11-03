package senati;

import java.util.Scanner;

public class Caso_06_profe {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int reg=0, aptos=0;
		String key = "S", estado = "";
		
		int numeracion=1;
		while (key.equals("S")) {
			System.out.println("REGISTRO #"+numeracion);
			System.out.print("NOMBRE: ");
			String name=sc.nextLine();
			System.out.print("EDAD..: ");
			int edad=sc.nextInt();
			
			if (edad>=18) {
				estado = "APTO PARA VOTAR";
				aptos++;
			} else if (edad>0 && edad<18) {
				estado = "NO APTO PARA VOTAR";
			}
			reg++;
			numeracion++;
			
			System.out.println("ESTADO: "+estado);
			estado = ""; //reinicio de estado
			sc.nextLine();
			
			System.out.print("\nDESEA REGISTRAR OTRO PARTICIPANTE? [S/N]: ");
			key=sc.nextLine(); key = key.toUpperCase();
			System.out.println();
	
		}
		
		System.out.println("RESUMEN\n=======");
		System.out.println("PARTICIPANTES REGISTRADOS: "+reg);
		System.out.println("APTOS PARA VOTAR.........: "+aptos+"\n");

	}

}
