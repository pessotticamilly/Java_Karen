import java.util.Scanner;

public class ex_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.print("\nÉ par!");
		}
		
		if(num % 2 != 0) {
			System.out.print("\nÉ impar!");
		}
		
		sc.close();
	}
}
