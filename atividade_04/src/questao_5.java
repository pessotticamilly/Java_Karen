import java.util.Scanner;

public class questao_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double aumento = 0, novoSalario = 0;
        String cargo = "";

        System.out.print("Insira o c�digo: ");
        int codigo = sc.nextInt();
        System.out.print("Sal�rio atual: ");
        double salario = sc.nextDouble();


        if(codigo == 1){
            cargo = "Escritur�rio";
            novoSalario = salario * 1.5;
            aumento = novoSalario - salario;
        } else if(codigo == 2){
            cargo = "Secret�rio";
            novoSalario = salario * 1.35;
            aumento = novoSalario - salario;
        } else if(codigo == 3){
            cargo = "Caixa";
            novoSalario = salario * 1.2;
            aumento = novoSalario - salario;
        } else if(codigo == 4){
            cargo = "Gerente";
            novoSalario = salario * 1.1;
            aumento = novoSalario - salario;
        } else if(codigo == 5){
            cargo = "Diretor";
            System.out.print("\nDiretores n�o possuem aumento");
        }

        System.out.print("\nCargo: " + cargo + "\nAumento: " + aumento + "\nNovo sal�rio: " + novoSalario);

        sc.close();
    }
}
