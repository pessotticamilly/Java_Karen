import java.util.Scanner;

public class questao_e {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o seu sal�rio fixo?\nR$ ");
		double salario = sc.nextDouble();
		
		System.out.print("Quantas vendas fez neste m�s?\nR: ");
		int vendas = sc.nextInt();
		
		double valorProduto = 0, comissao = 0;
		
		for(int i = 0; i < vendas; i++) {
			System.out.print("Qual o valor do " + (i + 1) + "� produto?\nR$ ");
			valorProduto = sc.nextDouble();
			
			comissao += valorProduto * 0.04;
		}
		
		System.out.print("\nSeu sal�rio esse m�s vai ser de R$ " + (salario + comissao));
		
		sc.close();
	}
}
