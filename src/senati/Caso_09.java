package senati;

import java.util.Scanner;
import java.text.DecimalFormat;;

public class Caso_09 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		DecimalFormat dfe=new DecimalFormat("#");
		
		int areg=0;
		String key = "S", estado = "", namemy="", namemn="";
		float mayorpp=0, menorpp=20, ac=0, asc=0, snotas=0, promp=0;
		
		int numeracion=1;
		while (key.equals("S")) {
			System.out.println(">> REGISTRO #"+numeracion);
			System.out.print("ALUMNO: ");
			String name=sc.nextLine();
			
			for (int i=1; i<=3; i++) {
				System.out.print("NOTA #"+i+": ");
				float nota=sc.nextFloat();
				
				switch (i) {
					case 1:
						snotas = snotas + nota*2;
						break;
					case 2:
						snotas = snotas + nota*3;
						break;
					case 3:
						snotas = snotas + nota*5;
						break;
				}
			}

			System.out.print("ASISTENCIA [1-12]: ");
			float asistencia=sc.nextFloat();

			promp = snotas/10;
			snotas = 0; //reinicio de valor para siguiente alumno
			
			// 12*0.7 >> 70% de asistencias
			if (promp>=13 && asistencia>=(12*0.7)) { 
				estado = "OBTINENE CERTIFICADO";
				ac+=1;
			}else{
				estado = "SIN CERTIFICADO";
				asc+=1;
			}
			
			if (promp>mayorpp) {
				mayorpp=promp; namemy=name;
			}
			if (promp<menorpp) {
				menorpp=promp; namemn=name;
			}
			
			System.out.println(">> RESULTADO #"+numeracion);
			System.out.println("PROMEDIO..: "+df.format(promp));
			System.out.println("ASISTENCIA: "+ df.format((asistencia/12)*100) +" %");
			System.out.println("ESTADO....: "+estado);
			
			areg++;
			numeracion++;
			
			sc.nextLine(); // reinicio entrada d etexto
			System.out.print("\nDESEA REGISTRAR OTRO? [S/N]: ");
			key=sc.nextLine(); key = key.toUpperCase();
			System.out.println();
	
		}
		
		System.out.println("RESUMEN\n=======");
		System.out.println("NÚMERO DE ALUMNOS: "+areg);
		System.out.println("EL MAYOR PROMEDIO "+mayorpp+" ES DE "+namemy);
		System.out.println("EL MENOR PROMEDIO "+menorpp+" ES DE "+namemn);
		System.out.println("# DE ALUMNOS CON CERTIFICADO: "+dfe.format(ac));
		System.out.println("# DE ALUMNOS SIN CERTIFICADO: "+dfe.format(asc));

	}
}