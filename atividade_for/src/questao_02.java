import java.util.Scanner;

public class questao_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menor18time1 = 0, contMais80time1 = 0, menor18time2 = 0, contMais80time2 = 0;
		double somaIdadesTime1 = 0, somaAlturasTime1 = 0, somaIdadesTime2 = 0, somaAlturasTime2 = 0;
		
		System.out.print("---- TIME 1 ----\n");

		for (int i = 0; i < 2; i++) {
			System.out.print("Qual a idade do jogador " + (i + 1) + "?\nR: ");
			int idade = sc.nextInt();
			
			System.out.print("Qual o peso do jogador " + (i + 1) + "?\nR: ");
			double peso = sc.nextDouble();
			
			System.out.print("Qual a altura do jogador " + (i + 1) + "?\nR: ");
			double altura = sc.nextDouble();
			
			System.out.print("\n");
			
			somaIdadesTime1 += idade;
			
			somaAlturasTime1 += altura;
			
			if(idade < 18) {
				menor18time1++;
			}
			
			if(peso > 80) {
				contMais80time1++;
			}
		}
		
		System.out.print("\nQuantidade de jogadores menor de 18 do time: " + menor18time1
				+ "\nMédia das idades do time: " + (somaIdadesTime1 / 2)
				+ "\nMédia das alturas do time: " + ((somaAlturasTime1 / 2) /100)
				+ "\nPorcentagem de jogadores com mais de 80kg do time: " + ((contMais80time1 * 100) / 2) + "%\n\n");
		
		System.out.print("---- TIME 2 ----\n");

		for (int i = 0; i < 2; i++) {
			System.out.print("Qual a idade do jogador " + (i + 1) + "?\nR: ");
			int idade = sc.nextInt();
			
			System.out.print("Qual o peso do jogador " + (i + 1) + "?\nR: ");
			double peso = sc.nextDouble();
			
			System.out.print("Qual a altura do jogador " + (i + 1) + "?\nR: ");
			double altura = sc.nextDouble();
			
			System.out.print("\n");
			
			somaIdadesTime2 += idade;
			
			somaAlturasTime2 += altura;
			
			if(idade < 18) {
				menor18time2++;
			}
			
			if(peso > 80) {
				contMais80time2++;
			}
		}
		
		System.out.print("Quantidade de jogadores menor de 18 do time: " + menor18time2
				+ "\nMédia das idades do time: " + (somaIdadesTime2 / 2)
				+ "\nMédia das alturas do time: " + ((somaAlturasTime2 / 2) / 100)
				+ "\nPorcentagem de jogadores com mais de 80kg do time: " + ((contMais80time2 * 100) / 2) + "%\n\n");

		int menor18total = menor18time1 + menor18time2, contMais80total = contMais80time1 + contMais80time2;
		double somaIdadesTotal = somaIdadesTime1 + somaIdadesTime2, somaAlturasTotal = somaAlturasTime1 + somaAlturasTime2;
		
		System.out.print("---- TOTAL ----");
		
		System.out.print("\nQuantidade de jogadores menor de 18: " + menor18total
				+ "\nMédia das idades: " + (somaIdadesTotal / 4)
				+ "\nMédia das alturas: " + ((somaAlturasTotal / 4) / 100)
				+ "\nPorcentagem de jogadores com mais de 80kg: " + ((contMais80total * 100) / 4) + "%\n\n");
		
		sc.close();
	}
}
