import java.util.Scanner;

public class questao_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1;

		do {
			System.out.print("Número 1: ");
			num1 = sc.nextInt();

			if (num1 == 0) {
				System.out.println("Número 1 não pode ser = '0'");
			}

		} while (num1 == 0);

		System.out.print("/\nNúmero 2: ");
		int num2 = sc.nextInt();

		System.out.println("Resultado: " + (num1 / num2));

		sc.close();

	}
}