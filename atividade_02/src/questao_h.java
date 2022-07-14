import java.util.Scanner;

public class questao_h {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valorTotal = 0;

		System.out.print("Digite a quantidade de contas pendentes: ");
		int contasPend = sc.nextInt();

		for (int i = 1; i <= contasPend; i++) {
			System.out.print("Digite o valor da conta à pagar (" + i + "): ");
			valorTotal += sc.nextDouble();
		}

		System.out.print("Salário recebido: ");
		double salario = sc.nextDouble();

		double restoSal = salario - valorTotal;
		System.out.println("Sobra do salário após o pagamanto das contas: " + restoSal);

		sc.close();

	}
}