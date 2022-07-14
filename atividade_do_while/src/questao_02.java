import java.util.Scanner;

public class questao_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0, codigo = 0, numVeiculos = 0, numAcidentes = 0, maiorIndice = 0, menorIndice = 999999999, cidadeMaior = 0, cidadeMenor = 0, contVeiculos = 0, contAcidentes = 0, contMais2000 = 0, mediaVeiculos = 0, mediaAcidentes = 0;
		
		do {
			System.out.print("---- CIDADE " + (i + 1) + " ----");
			System.out.print("\nQual o código da cidade?\nR: ");
			codigo = sc.nextInt();
			
			System.out.print("Qual o número de veículos de passeio da cidade?\nR: ");
			numVeiculos = sc.nextInt();
			
			System.out.print("Qual o número de acidentes de trânsito com vítimas da cidade?\nR: ");
			numAcidentes = sc.nextInt();
			
			System.out.print("\n");
			
			if(numAcidentes > maiorIndice) {
				maiorIndice = numAcidentes;
				cidadeMaior = codigo;
			}
			
			if(numAcidentes < menorIndice) {
				menorIndice = numAcidentes;
				cidadeMenor = codigo;
			}
			
			contVeiculos += numVeiculos;
			
			if(numVeiculos < 2000) {
				contAcidentes += numAcidentes;
				contMais2000++;
			}
			
			i++;
		} while(i < 5);
		
		mediaVeiculos = contVeiculos / 5;
		
		if(contMais2000 != 0) {
			mediaAcidentes = contAcidentes / contMais2000;
		}
		
		System.out.print("Maior índice de acidentes: " + maiorIndice
				+ "\nCódigo da cidade de maior índice de acidentes: " + cidadeMaior
				+ "\nMenor índice de acidentes: " + menorIndice
				+ "\nCódigo da cidade de menor índice de acidentes: " + cidadeMenor
				+ "\nMédia de veículos nas 5 cidades: " + mediaVeiculos
				+ "\nMédia de acidentes (cidades com menos de 2000 veículos): " + mediaAcidentes);
		
		sc.close();
	}
}