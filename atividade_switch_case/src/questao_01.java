import java.util.Scanner;

public class questao_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o código do cargo..." + "\n1 - Escrituário" + "\n2 - Secretário" + "\n3 - Caixa"
				+ "\n4 - Gerente" + "\n5 - Diretor" + "\nR: ");
		int codigo = sc.nextInt();

		System.out.print("\nDigite o salário atual" + "\nR: R$ ");
		double salario = sc.nextDouble();

		double novoSalario = 0;

		switch (codigo) {
		case 1:
			novoSalario = salario * 1.50;

			System.out.printf("\nCargo: Escrituário" + "\nAumento: 50%%" + "\nNovo salário: %.2f", novoSalario);
			break;

		case 2:
			novoSalario = salario * 1.35;

			System.out.printf("\nCargo: Secretário" + "\nAumento: 35%%" + "\nNovo salário: %.2f", novoSalario);
			break;

		case 3:
			novoSalario = salario * 1.2;

			System.out.printf("\nCargo: Caixa" + "\nAumento: 20%%" + "\nNovo salário: %.2f", novoSalario);
			break;

		case 4:
			novoSalario = salario * 1.1;

			System.out.printf("\nCargo: Gerente" + "\nAumento: 10%%" + "\nNovo salário: %.2f", novoSalario);
			break;

		case 5:
			System.out.printf("\nCargo: Diretor" + "\nAumento: Tu já é diretor né cara, para que aumento?"
					+ "\nNovo salário: %.2f", salario);
			break;
		}

		sc.close();
	}
}