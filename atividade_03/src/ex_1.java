import java.util.Scanner;

public class ex_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nota trabalho de labolatório: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Nota avaliação semestral: ");
		double nota2 = sc.nextDouble();
		
		System.out.print("Nota exame final: ");
		double nota3 = sc.nextDouble();
		
		double media = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5));
		
		char conceito = 0;
		
		
		if(media >= 0 && media <= 4.9) {
			conceito = 'E';
		}
		
		if(media >= 5 && media <= 5.9) {
			conceito = 'D';
		}
		
		if(media >= 6 && media <= 6.9) {
			conceito = 'C';
		}
		
		if(media >= 7 && media <= 7.9) {
			conceito = 'B';
		}
		
		if(media >= 8 && media <= 10) {
			conceito = 'A';
		}
		
		System.out.print("\nMédia: " + media + "\nConceito: " + conceito);
		
		sc.close();
	}
}
