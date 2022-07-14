import java.util.Scanner;

public class ex_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int a = sc.nextInt();
				
		System.out.print("Informe outro número: ");
		int b = sc.nextInt();
		
		System.out.print("Informe o último número: ");
		int c = sc.nextInt();
		
		System.out.println("\n---- ESCOLHA ----"
				+ "\n1 - Ordem crescente"
				+ "\n2 - Ordem decrescente"
				+ "\n3 - Maior número no meio"
				+ "R: ");
		int escolha = sc.nextInt();
		
		if(escolha == 1) {
			if(a > b && a < c) {
				System.out.print("\n" + b + " - " + a + " - " + c);
			}
			
			if(a > c && a < b) {
				System.out.print("\n" + c + " - " + a + " - " + b);
			}
			
			if(b > a && b < c) {
				System.out.print("\n" + a + " - " + b + " - " + c);
			}
			
			if(b > c && b < a) {
				System.out.print("\n" + c + " - " + b + " - " + a);
			}
			
			if(c > b && c < a) {
				System.out.print("\n" + b + " - " + c + " - " + a);
			}
			
			if(c > a && c < b) {
				System.out.print("\n" + a + " - " + c + " - " + b);
			}
		}
		
		if(escolha == 2) {
			if(a < b && a > c) {
				System.out.print("\n" + b + " - " + a + " - " + c);
			}
			
			if(a < c && a > b) {
				System.out.print("\n" + c + " - " + a + " - " + b);
			}
			
			if(b < a && b > c) {
				System.out.print("\n" + a + " - " + b + " - " + c);
			}
			
			if(b < c && b > a) {
				System.out.print("\n" + c + " - " + b + " - " + a);
			}
			
			if(c < b && c > a) {
				System.out.print("\n" + b + " - " + c + " - " + a);
			}
			
			if(c < a && c > b) {
				System.out.print("\n" + a + " - " + c + " - " + b);
			}
		}
		
		if(escolha == 3) {
			if(a > b && a > c) {
				System.out.print("\n" + b + " - " + a + " - " + c);
			}
			
			if(b > a && b > c) {
				System.out.print("\n" + a + " - " + b + " - " + c);
			}
			
			if(c > a && c > b) {
				System.out.print("\n" + a + " - " + c + " - " + b);
			}
		}
		
		sc.close();
	}
}
