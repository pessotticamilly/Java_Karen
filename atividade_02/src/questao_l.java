import java.util.Scanner;

public class questao_l {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Custo do espet�culo: ");
		int custo = sc.nextInt();

		System.out.print("Pre�o do ingresso: ");
		int preco = sc.nextInt();

		System.out.println("Vendas de ingressos necess�ria para  cobrir o custo: " + (custo / preco));

		sc.close();

	}
}