import java.util.Scanner;

public class questao_n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade da ração comprada em Kg: ");
		double racaoKg = sc.nextDouble();

		System.out.print("Quantidade da ração fornecida aos gatos em gramas: ");
		double racaoGato = sc.nextDouble();

		double racaoRestante = racaoKg - ((racaoGato / 1000) * 5);

		System.out.println("Ração restante no pacote: " + racaoRestante + "Kg");

		sc.close();
	}
}