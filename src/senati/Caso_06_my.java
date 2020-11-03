package senati;

import java.util.Scanner;

public class Caso_06_my {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int reg=0, aptos=0;
		String key = "S", estado = "NO APTO PARA VOTAR";
		
		int numeracion=1;
		while (key.equals("S")) {
			System.out.println("REGISTO #"+numeracion);
			System.out.print("NOMBRE: ");
			String name=sc.nextLine();
			System.out.print("EDAD..: ");
			int edad=sc.nextInt();
			
			if (edad>=18) {
				estado = "APTO PARA VOTAR";
				aptos++;
			}
			reg++;
			numeracion++;
			
			System.out.println("ESTADO: "+estado);
			key = "novasalir";
			System.out.println();
			
			while (!key.equals("S")){
				System.out.print("DESEA REGISTRAR OTRO PARTICIPANTE? [S/N]: ");
				key=sc.nextLine(); key = key.toUpperCase();
				System.out.println();
				
				if (key.equals("N")) {
					break;
				}
			}
	
		}
		
		System.out.println("RESUMEN\n=======");
		System.out.println("PARTICIPANTES REGISTRADOS: "+reg);
		System.out.println("APTOS PARA VOTAR.........: "+aptos);
		
	}
}