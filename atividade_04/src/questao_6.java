import java.util.Scanner;

public class questao_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario;

		System.out.println("---- MENU ----" + "\n1 - Imposto" + "\n2 - Novo sal�rio" + "\n3 - Classifica��o" + "\nR: ");
		int opcao = sc.nextInt();

		if (opcao == 1) {
			System.out.print("\nInsira seu sal�rio atual: ");
			salario = sc.nextDouble();

			if (salario < 500) {
				System.out.print("\nImposto a pagar: " + (salario * 0.05));
			} else if (salario <= 850) {
				System.out.print("\nImposto a pagar: " + (salario * 0.10));
			} else {
				System.out.print("\nImposto a pagar: " + (salario * 0.15));
			}
			
		} else if (opcao == 2) {
			System.out.print("\nInsira seu sal�rio atual: ");
			salario = sc.nextDouble();

			if (salario < 400) {
				salario = salario + 100;
			} else if (salario < 750) {
				salario = salario + 75;
			} else if (salario < 1500) {
				salario = salario + 50;
			} else {
				salario = salario + 25;
			}
			
			System.out.print("\nSeu novo sal�rio ser� de: " + salario);
			
		} else if (opcao == 3) {
			System.out.print("\nInsira seu sal�rio atual: ");
			salario = sc.nextDouble();

			if (salario <= 700) {
				System.out.print("\nVoc� � mal remunerado!");
			} else {
				System.out.print("\nVoc� � bem remunerado!");
			}
		}

		sc.close();
	}
}
