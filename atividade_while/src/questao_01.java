import java.util.Scanner;

public class questao_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o seu sal�rio Carlos?\nR$ ");
		double salarioCarlos = sc.nextDouble();

		double salarioJoao = salarioCarlos / 3;

		int contMes = 0;

		while (salarioJoao < salarioCarlos) {
			salarioCarlos += salarioCarlos * 0.02;

			salarioJoao += salarioJoao * 0.05;

			contMes++;
		}

		System.out.printf(
				"\nSal�rio Carlos: R$ %.2f\nSal�rio Jo�o: R$ %.2f\nDemorou %d meses para o sal�rio de Jo�o igualar-se ou ultrapassar o sal�rio de Carlos.", salarioCarlos, salarioJoao, contMes);

		sc.close();
	}
}