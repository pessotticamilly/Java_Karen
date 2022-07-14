import java.util.Scanner;

public class questao_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		System.out.print("\n---- TABUADA DO " + num + " ----");
		
		for(int i = 0; i < 10; i++) {
			System.out.print("\n" + num + " x " + (i + 1) + " = " + (num * (i + 1)));
		}
		
		sc.close();
	}
}