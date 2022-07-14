import java.util.Scanner;

public class questao_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Número 1: ");
		int num1 = sc.nextInt();

		System.out.print("*\nNúmero 2: ");
		int num2 = sc.nextInt();

		System.out.print("*\nNúmero 3: ");
		int num3 = sc.nextInt();

		System.out.println("Resultado: " + (num1 * num2 * num3));

		sc.close();

	}
}