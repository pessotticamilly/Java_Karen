import java.util.Scanner;

public class ex_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.print("\n� par!");
		}
		
		if(num % 2 != 0) {
			System.out.print("\n� impar!");
		}
		
		sc.close();
	}
}
