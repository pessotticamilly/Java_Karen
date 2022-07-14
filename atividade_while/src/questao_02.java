import java.util.Scanner;

public class questao_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 1;

		while (num > 0) {
			System.out.print("Digite um número: ");
			num = sc.nextInt();

			System.out.print("\nNúmero: " + num
					+ "\nQuadrado do número: " + Math.pow(num, 2)
					+ "\nCubo do número: " + Math.pow(num, 3)
					+ "\nRaíz quadrada do número: " + Math.sqrt(num)
					+ "\n\n- - - - - - - - - - - - - - - -\n\n");
		}

		sc.close();
	}
}