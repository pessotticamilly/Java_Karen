import java.util.Scanner;

public class questao_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0, codigo = 0, numVeiculos = 0, numAcidentes = 0, maiorIndice = 0, menorIndice = 999999999, cidadeMaior = 0, cidadeMenor = 0, contVeiculos = 0, contAcidentes = 0, contMais2000 = 0, mediaVeiculos = 0, mediaAcidentes = 0;
		
		do {
			System.out.print("---- CIDADE " + (i + 1) + " ----");
			System.out.print("\nQual o c�digo da cidade?\nR: ");
			codigo = sc.nextInt();
			
			System.out.print("Qual o n�mero de ve�culos de passeio da cidade?\nR: ");
			numVeiculos = sc.nextInt();
			
			System.out.print("Qual o n�mero de acidentes de tr�nsito com v�timas da cidade?\nR: ");
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
		
		System.out.print("Maior �ndice de acidentes: " + maiorIndice
				+ "\nC�digo da cidade de maior �ndice de acidentes: " + cidadeMaior
				+ "\nMenor �ndice de acidentes: " + menorIndice
				+ "\nC�digo da cidade de menor �ndice de acidentes: " + cidadeMenor
				+ "\nM�dia de ve�culos nas 5 cidades: " + mediaVeiculos
				+ "\nM�dia de acidentes (cidades com menos de 2000 ve�culos): " + mediaAcidentes);
		
		sc.close();
	}
}