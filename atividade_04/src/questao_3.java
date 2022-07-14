import java.util.Scanner;

public class questao_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Primeira data: ");
        System.out.print("Dia: ");
        int dia1 = sc.nextInt();
        
        System.out.print("Mês: ");
        int mes1 = sc.nextInt();
        
        System.out.print("Ano: ");
        int ano1 = sc.nextInt();
        
        int numeroDias1 = (ano1 * 365) + (mes1 * 30) + dia1;

        System.out.println("Segunda data: ");
        System.out.print("Dia: ");
        int dia2 = sc.nextInt();
        
        System.out.print("MÃªs: ");
        int mes2 = sc.nextInt();
        
        System.out.print("Ano: ");
        int ano2 = sc.nextInt();
        
        int numeroDias2 = (ano2 * 365) + (mes2 * 30) + dia2;

        if(numeroDias1 < numeroDias2){
            System.out.print("\nA 1ª data vem antes");
        } else if(numeroDias2 < numeroDias1){
            System.out.print("\nA 2ª data vem antes");
        } else {
            System.out.print("\nAs datas são iguais");
        }
        
        sc.close();
    }
}
