import java.util.Scanner;

public class questao_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double aumento = 0, novoSalario = 0;
        String cargo = "";

        System.out.print("Insira o código: ");
        int codigo = sc.nextInt();
        System.out.print("Salário atual: ");
        double salario = sc.nextDouble();


        if(codigo == 1){
            cargo = "Escriturário";
            novoSalario = salario * 1.5;
            aumento = novoSalario - salario;
        } else if(codigo == 2){
            cargo = "Secretério";
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
            System.out.print("\nDiretores não possuem aumento");
        }

        System.out.print("\nCargo: " + cargo + "\nAumento: " + aumento + "\nNovo salário: " + novoSalario);

        sc.close();
    }
}
