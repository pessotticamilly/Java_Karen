import java.util.Scanner;

public class ex_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Notas 1: ");
		double nota1 = sc.nextDouble();

		System.out.print("Notas 2: ");
		double nota2 = sc.nextDouble();

		System.out.print("Notas 3: ");
		double nota3 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		String condicao = null;

		double faltante = 0;

		if (media >= 0 && media <= 2.9) {
			condicao = "Reprovado";
		}

		if (media >= 3 && media <= 6.9) {
			condicao = "Em recupera��o";

			faltante = 7 - media;
		}

		if (media >= 7 && media <= 10) {
			condicao = "Aprovado";
		}

		if (condicao.equals("Em recupera��o")) {
			System.out.printf("\nM�dia: %.1f \nCondi��o: %.1s \nFalta %.1f para atingir a m�dia", media, condicao,
					faltante);
		}

		if (condicao.equals("Reprovado") || condicao.equals("Reporvado")) {
			System.out.printf("\nM�dia: %.1f \nCondi��o: %.1s", media, condicao);
		}

		sc.close();
	
	}
}
