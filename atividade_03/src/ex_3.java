import java.util.Scanner;

public class ex_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite outro n�mero: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.print("\nMaior n�mero: " + num1);
		}
		
		if(num2 > num1) {
			System.out.print("\nMaior n�mero: " + num2);
		}
		
		if(num1 == num2) {
			System.out.print("\nOs dois n�meros s�o iguais");
		}
		
		sc.close();
	}
}
