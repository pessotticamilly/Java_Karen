import java.util.Scanner;

public class questao_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double totalSalarios = 0, mediaPecasHomem=0, mediaPecasMulheres=0, salario, maiorSalario = 0;
        int codigo, quantidadeDePecas, codigoOperarioMaiorSalario = 0, contHomem = 0, contMulher = 0, totalPecas = 0;
        String genero;

        System.out.print("Digite o sal�rio m�nimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.print("\n");
        
        for (int i = 1; i <= 3; i++){
            System.out.print("Digite seu c�digo: ");
            codigo = sc.nextInt();

            System.out.print("Digite a quantidade de pe�as que voc� fez: ");
            quantidadeDePecas = sc.nextInt();

            System.out.print("Digite seu g�nero: ");
            genero = sc.next();

            if(quantidadeDePecas <= 30){
                salario = salarioMinimo;
            } else if(quantidadeDePecas <= 50){
                salario = salarioMinimo + ((salarioMinimo * 0.03) * (quantidadeDePecas-30));
            } else {
                salario = salarioMinimo + ((salarioMinimo * 0.05) * (quantidadeDePecas-30));
            }

            if(i == 1){
                maiorSalario = salario;
                codigoOperarioMaiorSalario = codigo;
            } else {
                if(salario > maiorSalario){
                    maiorSalario = salario;
                    codigoOperarioMaiorSalario = codigo;
                }
            }

            if(genero.equals("homem")){
                contHomem++;
                mediaPecasHomem += quantidadeDePecas;
            } else {
                contMulher++;
                mediaPecasMulheres += quantidadeDePecas;
            }

            totalSalarios += salario;
            totalPecas += quantidadeDePecas;

            System.out.print("------------\n");
            System.out.print("C�digo: " + codigo);
            System.out.print("\nSal�rio: " + salario + "\n----------\n\n");
        }

        System.out.print("Total de sal�rios: " + totalSalarios);
        System.out.print("\nTotal de pe�as produzidas: " + totalPecas);
        System.out.print("\nM�dia de pe�as fabricadas por homens: " + (mediaPecasHomem / contHomem));
        System.out.print("\nM�dia de pe�as fabricada por mulheres: " + (mediaPecasMulheres / contMulher));

        System.out.print("\n\nC�digo do oper�rio com maior sal�rio: " +codigoOperarioMaiorSalario);
        
		sc.close();
	}
}