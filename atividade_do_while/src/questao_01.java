import java.util.Scanner;

public class questao_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 2, resultado = 0;

		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();

		do {
			if (num > 1) {
				if(num == 2) {
					resultado = 0;
				} else {
					if (num % i == 0) {
						resultado++;
					}

					i++;
				}
			} else {
				System.out.print("\nO n�mero precisa ser maior que 1...");
				break;
			}
		} while (i < num);

		if(num > 1) {
			if (resultado == 0) {
				System.out.println("\n� primo");
			} else {
				System.out.println("\nN�o � primo");
			}
		}

		sc.close();
	}
}