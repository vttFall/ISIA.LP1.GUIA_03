package senati;

public class Caso_01 {

	public static void main(String[] args) {
		// AUMENTE DE 1 A 5
		System.out.println("CRECIENTE");
		System.out.println("=========");
		
		int i = 1;
		while (i <= 5) {
			System.out.println("MENSAJE " + i);
			i++;
		}
		// DECRECIENTE DE 5 A 1
		System.out.println("\nDECRECIENTE");
		System.out.println("===========");
		
		int j = 5;
		while (j >= 1) {
			System.out.println("MENSAJE " + j);
			j--;
		}
	}
}