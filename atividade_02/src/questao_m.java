import java.util.Scanner;

public class questao_m {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sal�rio m�nimo: ");
		double salMin = sc.nextDouble();
		
		System.out.print("QuiloWatts consumidos na resid�ncia: ");
		double kw = sc.nextDouble();
		
		double valKw = salMin / 5;
		
		System.out.println("Valor do quiloWatts: " + valKw);
		System.out.println("Valor a ser pago pela resid�ncia: " + (valKw * kw));
		System.out.println("Valor a ser pago com desconto de 15%: " + ((valKw * kw) - ((valKw * kw) * 0.15)));
		sc.close();
		
	}	
}