import java.util.Scanner;

public class funcoes_java {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int num = sc.nextInt();
		
		System.out.print("\nElevado ao quadrado: " + Math.pow(num, 2) + "\nElevado ao cubo: " + Math.pow(num, 3) + "\nRa�z quadrada: " + Math.sqrt(num) + "\nRa�z c�bica: " + Math.cbrt(num));
		
		sc.close();
	}
}
