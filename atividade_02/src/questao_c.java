import java.util.Scanner;

public class questao_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1;

		do {
			System.out.print("N�mero 1: ");
			num1 = sc.nextInt();

			if (num1 == 0) {
				System.out.println("N�mero 1 n�o pode ser = '0'");
			}

		} while (num1 == 0);

		System.out.print("/\nN�mero 2: ");
		int num2 = sc.nextInt();

		System.out.println("Resultado: " + (num1 / num2));

		sc.close();

	}
}