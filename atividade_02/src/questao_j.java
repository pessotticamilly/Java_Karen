import java.util.Scanner;

public class questao_j {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor à converter: ");
		double valor = sc.nextDouble();

		System.out.println("Dólar: " + valor * 0.20);
		System.out.println("Euro: " + valor * 0.19);
		System.out.println("Libra Esterlina: " + valor * 0.16);

		sc.close();

	}
}