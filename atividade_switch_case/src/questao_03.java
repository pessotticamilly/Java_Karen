import java.util.Scanner;

public class questao_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de livros que vai comprar: ");
		int qtdLivros = sc.nextInt();

		double criterioA = (qtdLivros * 0.25) + 7.5;
		double criterioB = (qtdLivros * 0.5) + 2.5;

		if (criterioA < criterioB) {
			System.out.print("\nMelhor op��o para aproveitar: Crit�rio A");
		} else {
			System.out.print("\nMelhor op��o para aproveitar: Crit�rio B");
		}
		
		System.out.print("\n\nValor crit�rio A: " + criterioA);
		System.out.print("\nValor crit�rio B: " + criterioB);

		sc.close();
	}
}