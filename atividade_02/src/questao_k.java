import java.util.Scanner;

public class questao_k {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Hora: ");
		int hora = sc.nextInt();
		System.out.print("Minutos: ");
		int minutos = sc.nextInt();

		System.out.println("Hora digita em minutos: " + (hora * 60));
		System.out.println("Total de minutos: " + ((hora * 60) + minutos));
		System.out.println("Minutos totais em segundos: " + (((hora * 60) + minutos)) * 60);

		sc.close();

	}
}