import java.util.Scanner;

public class questao_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("N�mero 1: ");
		int num1 = sc.nextInt();

		System.out.print("*\nN�mero 2: ");
		int num2 = sc.nextInt();

		System.out.print("*\nN�mero 3: ");
		int num3 = sc.nextInt();

		System.out.println("Resultado: " + (num1 * num2 * num3));

		sc.close();

	}
}