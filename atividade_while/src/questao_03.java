import java.util.Scanner;

public class questao_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 1;
		int todosNums = 0;
		int contNums = 0;
		int maiorNum = 0;
		int menorNum = 30000;
		int numPares = 0;
		int contNumPares = 0;
		int contNumImpares = 0;

		while (num < 30000) {
			System.out.print("Digite um número: ");
			num = sc.nextInt();

			if (num > maiorNum) {
				maiorNum = num;
			}

			if (num < menorNum) {
				menorNum = num;
			}

			if (num % 2 == 0) {
				numPares += num;

				contNumPares++;
			} else {
				contNumImpares++;
			}

			todosNums += num;

			contNums++;
		}

		System.out.print("\nSoma dos números: " + todosNums
				+ "\nQuantidade de números digitados: " + contNums
				+ "\nMaior número: " + maiorNum
				+ "\nMenor número: " + menorNum
				+ "\nMédia dos número pares: " + (numPares / contNumPares)
				+ "\nPorcetnagem de números ímpares: " + ((contNumImpares * 100) / contNums) + "%");

		sc.close();
	}
}