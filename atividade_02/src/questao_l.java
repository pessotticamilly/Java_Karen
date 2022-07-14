import java.util.Scanner;

public class questao_l {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Custo do espetáculo: ");
		int custo = sc.nextInt();

		System.out.print("Preço do ingresso: ");
		int preco = sc.nextInt();

		System.out.println("Vendas de ingressos necessária para  cobrir o custo: " + (custo / preco));

		sc.close();

	}
}