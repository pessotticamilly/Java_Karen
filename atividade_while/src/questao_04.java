import java.util.Scanner;

public class questao_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantidadeQW = 1, consumidores = 0;
		double valorASerPago = 0, faturamentoTotal = 0;

		while (true) {
			System.out.print("Qual o valor do seu salário mínimo?\nR$ ");
			double salario = sc.nextDouble();

			System.out.print("Quantos QuiloWatts gastou?\nR: ");
			quantidadeQW = sc.nextInt();

			if (quantidadeQW == 0) {
				break;
			}
			;

			System.out.print("Escolha seu tipo de consumidor:" + "\n1 - Residencial" + "\n2 - Comercial"
					+ "\n3 - Industrial" + "\nR: ");
			int tipoConsumidor = sc.nextInt();

			System.out.print("\nValor do QuiloWatt: R$" + (salario / 8));

			switch (tipoConsumidor) {
			case 1:
				valorASerPago = (((salario / 8) * quantidadeQW) + ((salario / 8) * quantidadeQW) * 0.05);
				System.out.print("\nAcréscimo: 5% \nValor a ser pago: R$" + valorASerPago + "\n\n");
				break;

			case 2:
				valorASerPago = (((salario / 8) * quantidadeQW) + ((salario / 8) * quantidadeQW) * 0.10);
				System.out.print("\nAcréscimo: 10% \nValor a ser pago: R$" + valorASerPago + "\n\n");
				break;

			case 3:
				valorASerPago = (((salario / 8) * quantidadeQW) + ((salario / 8) * quantidadeQW) * 0.15);
				System.out.print("\nAcréscimo: 15% \nValor a ser pago: R$" + valorASerPago + "\n\n");
				break;
			}

			if (valorASerPago >= 500 && valorASerPago <= 1000) {
				consumidores++;
			}

			faturamentoTotal += valorASerPago;
		}

		System.out.print("\nFaturamento geral da empresa: " + faturamentoTotal
				+ "\nQuantidade de consumidres que gastam de R$ 500,00 à R$ 1000,00: " + consumidores);

		sc.close();
	}
}