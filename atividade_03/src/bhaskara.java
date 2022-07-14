import java.util.Scanner;

public class bhaskara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("A: ");
		int a = sc.nextInt();

		System.out.print("B: ");
		int b = sc.nextInt();

		System.out.print("C: ");
		int c = sc.nextInt();

		double d = (Math.pow(b, 2) - (4 * a * c));

		double x1 = ((-(b) + Math.sqrt(d)) / (a * 2));

		double x2 = ((-(b) - Math.sqrt(d)) / (a * 2));
		
		System.out.print("\nDelta: " + d);

		if (d > 0) {
			System.out.print("\n\nTemos duas variáveis: ");
			
			System.out.print("\nX': " + x1 + "\nX\": " + x2);
		} else if(d == 0) {
			System.out.print("\n\nTemos uma variável: ");
			
			if(x1 != 0) {
				System.out.print("\nX: " + x1);
			} else if(x2 != 0) {
				System.out.print("\nX: " + x2);
			}
			
		} else if(d < 0) {
			System.out.print("\n\nNão temos nenhuma váriavel");
		}
		
		sc.close();
		
		// Delta > 0:
		// A: 4
		// B: 2
		// C: -6
		
		// Delta == 0:
		// A: 1
		// B: 6
		// C: 9
		
		// Delta < 0:
		// A: 7
		// B: 3
		// C: 4
	}
}
