import java.util.Scanner;

public class questao_i {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salarioTotal;

		System.out.print("Valor do salário minimo: ");
		double valSalMin = sc.nextDouble();

		System.out.print("Horas trabalhadas: ");
		int hrsTrabalhadas = sc.nextInt();
		double valHrsTrab = valSalMin / 8;

		System.out.print("Horas extras: ");
		int hrsExtra = sc.nextInt();
		double valHrsExtra = valSalMin / 4;

		salarioTotal = (valHrsTrab * hrsTrabalhadas) + (valHrsExtra * hrsExtra);

		System.out.print("Salário á receber: " + salarioTotal);

		sc.close();

	}
}