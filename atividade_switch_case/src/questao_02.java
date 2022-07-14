import java.util.Scanner;

public class questao_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o código do produto(1-10)?" + "\nR: ");
		int codigoProduto = sc.nextInt();

		System.out.print("\nQual o peso do produto?" + "\nR: ");
		double pesoProduto = sc.nextDouble();

		System.out.print("\nQual é o código do país de origem do produto(1-3)?" + "R: ");
		int codigoPais = sc.nextInt();

		double precoProduto = 0;
		
		switch (codigoProduto) {
		case 1:
			precoProduto = (1000 * 10) / pesoProduto;
			break;

		case 2:
			precoProduto = (1000 * 10) / pesoProduto;
			break;

		case 3:
			precoProduto = (1000 * 10) / pesoProduto;
			break;

		case 4:
			precoProduto = (1000 * 10) / pesoProduto;
			break;

		case 5:
			precoProduto = (1000 * 25) / pesoProduto;
			break;

		case 6:
			precoProduto = (1000 * 25) / pesoProduto;
			break;

		case 7:
			precoProduto = (1000 * 25) / pesoProduto;
			break;

		case 8:
			precoProduto = (1000 * 35) / pesoProduto;
			break;

		case 9:
			precoProduto = (1000 * 35) / pesoProduto;
			break;

		case 10:
			precoProduto = (1000 * 35) / pesoProduto;
			break;
		}
		
		double valorImposto = 0;
		
		switch(codigoPais) {
		case 1:
			valorImposto = 0;
			break;
			
		case 2:
			valorImposto = precoProduto * 0.15;
			break;
			
		case 3:
			valorImposto = precoProduto * 0.25;
			break;
		}
		
		double total = precoProduto + valorImposto;
		
		System.out.printf("\nPeso do produto: %.1f"
				+ "\nPreço do produto: %.2f"
				+ "\nValor do imposto: %.2f"
				+ "\nTotal: %.2f", pesoProduto, precoProduto, valorImposto, total);

		sc.close();
	}
}