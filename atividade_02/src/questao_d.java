import java.util.Scanner;

public class questao_d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Preço: ");
		int num1 = sc.nextInt();

		System.out.println("Novo preço: " + (num1 - (num1 * 0.1)));

		sc.close();

	}
}