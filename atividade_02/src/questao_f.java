import java.util.Scanner;

public class questao_f {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sal�rio m�nimo: ");
		int num1 = sc.nextInt();

		System.out.print("Sal�rio do funcion�rio: ");
		int num2 = sc.nextInt();

		int qntdSal = num2 / num1;

		System.out.println("Quantidade de sal�rios m�nimos que este funcion�rio possui: " + (qntdSal));

		sc.close();

	}
}