import java.util.Scanner;

public class questao_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o c�digo do cargo..." + "\n1 - Escritu�rio" + "\n2 - Secret�rio" + "\n3 - Caixa"
				+ "\n4 - Gerente" + "\n5 - Diretor" + "\nR: ");
		int codigo = sc.nextInt();

		System.out.print("\nDigite o sal�rio atual" + "\nR: R$ ");
		double salario = sc.nextDouble();

		double novoSalario = 0;

		switch (codigo) {
		case 1:
			novoSalario = salario * 1.50;

			System.out.printf("\nCargo: Escritu�rio" + "\nAumento: 50%%" + "\nNovo sal�rio: %.2f", novoSalario);
			break;

		case 2:
			novoSalario = salario * 1.35;

			System.out.printf("\nCargo: Secret�rio" + "\nAumento: 35%%" + "\nNovo sal�rio: %.2f", novoSalario);
			break;

		case 3:
			novoSalario = salario * 1.2;

			System.out.printf("\nCargo: Caixa" + "\nAumento: 20%%" + "\nNovo sal�rio: %.2f", novoSalario);
			break;

		case 4:
			novoSalario = salario * 1.1;

			System.out.printf("\nCargo: Gerente" + "\nAumento: 10%%" + "\nNovo sal�rio: %.2f", novoSalario);
			break;

		case 5:
			System.out.printf("\nCargo: Diretor" + "\nAumento: Tu j� � diretor n� cara, para que aumento?"
					+ "\nNovo sal�rio: %.2f", salario);
			break;
		}

		sc.close();
	}
}