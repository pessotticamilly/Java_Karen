import java.util.Scanner;

public class questao_d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Pre�o: ");
		int num1 = sc.nextInt();

		System.out.println("Novo pre�o: " + (num1 - (num1 * 0.1)));

		sc.close();

	}
}