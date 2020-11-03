package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		DecimalFormat dfe=new DecimalFormat("#");
		
		String key="S", name="", tardon="", platudo="", pobre="";
		float ht=0, tarifa=0, sbruto=0, bono=0, descuento=0, sneto=0, meta=0, snmy=0, snmn=(float)Math.pow(125, 8.0);
		int mtardanza, mmt=0, ecm=0;
		
		int numeracion=1;
		while (key.equals("S")) {
			
			System.out.println(">> REGISTRO DE EMPLEADO #"+numeracion);
			System.out.print("NOMBRE DE EMPLEADO..: ");
			name=sc.nextLine();
			System.out.print("HORAS TRABAJADAS....: ");
			ht=sc.nextFloat();
			System.out.print("TARIFA POR HORA (S/): ");
			tarifa=sc.nextFloat();
			System.out.print("MINUTOS DE TARDANZA.: ");
			mtardanza=sc.nextInt();
			
			if (mtardanza>mmt) {
				mmt = mtardanza;
				tardon = name;
			}
			
			sbruto=ht*tarifa;
			
			if (ht<=50) {
				bono = sbruto * 0;
			}else if (ht>50 && ht<=60){	
				bono = sbruto * 0.02f;
			}else if (ht>60 && ht<=70){
				bono = sbruto * 0.08f;
			}else if (ht>70 && ht<=80){
				bono = sbruto * 0.13f;
			}else if (ht>80){
				bono = sbruto * 0.15f;
			}
			
			if (mtardanza<=15) {
				descuento = sbruto * 0 * mtardanza;
			}else if (mtardanza>15 && mtardanza<=30){	
				descuento = sbruto * 0.003f * mtardanza;
			}else if (mtardanza>30){
				descuento = sbruto * 0.005f * mtardanza;
			}
			
			sneto = sbruto + bono - descuento;
			meta = (ht/80)*100;
			
			if (meta > 90){
				ecm += 1;
			}
			
			System.out.println(">> RESULTADO #"+numeracion);
			System.out.println("SUELDO BRUTO (S/): "+df.format(sbruto));
			System.out.println("BONIFICACIÓN (S/): "+df.format(bono));
			System.out.println("DESCUENTO....(S/): "+df.format(descuento));
			System.out.println("SUELDO NETO..(S/): "+df.format(sneto));
			System.out.println("% ALCANZADO......: "+df.format(meta)+" %");
			
			bono = 0; descuento = 0; // reinico de valores
			numeracion++;
			
			if (sneto > snmy) {
				snmy = sneto;
				platudo = name;
			}
			if (sneto < snmn) {
				snmn = sneto;
				pobre = name;
			}
			
			sc.nextLine(); // reinicio entrada de texto
			System.out.print("\nREGISTRAR NUEVO EMPLEADO? [S/N]: ");
			key=sc.nextLine(); key = key.toUpperCase();
			System.out.println();
			
		}
		
		System.out.println("RESUMEN\n=======");
		System.out.println("NÚMERO DE EMPLEADOS: ");
		System.out.println("SUELDO NETO MAYOR ES S/"+snmy+" DE "+platudo);
		System.out.println("SUELDO NETO MENOR ES S/"+snmn+" DE "+pobre);
		System.out.println("EL EMPLEADO TARDÓN ES "+tardon+" CON "+mmt+" mín DE TARDANZA");
		System.out.println("# DE EMPLEADOS CON META MAYOR A 90%: "+dfe.format(ecm));

	}
}