import java.util.Scanner;

public class questao_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("---- MENU ----" +
                "\n1 - Somar dois números" +
                "\n2 - Raiz quadrada de um número" +
                "\nR: ");
        int opcao = sc.nextInt();

        if(opcao == 1){
            System.out.print("\nPrimeiro número: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Segundo número: ");
            double num2 = sc.nextDouble();
            
            System.out.println("\nResultado: " + (num1 + num2));
        } else {
            System.out.print("\nInsira um número: ");
            System.out.println("\nResultado: " + Math.sqrt(sc.nextDouble()));
        }
        
        sc.close();
    }
}
