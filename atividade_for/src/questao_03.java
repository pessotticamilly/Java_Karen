import java.util.Scanner;

public class questao_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double totalSalarios = 0, mediaPecasHomem=0, mediaPecasMulheres=0, salario, maiorSalario = 0;
        int codigo, quantidadeDePecas, codigoOperarioMaiorSalario = 0, contHomem = 0, contMulher = 0, totalPecas = 0;
        String genero;

        System.out.print("Digite o salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.print("\n");
        
        for (int i = 1; i <= 3; i++){
            System.out.print("Digite seu código: ");
            codigo = sc.nextInt();

            System.out.print("Digite a quantidade de peças que você fez: ");
            quantidadeDePecas = sc.nextInt();

            System.out.print("Digite seu gênero: ");
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
            System.out.print("Código: " + codigo);
            System.out.print("\nSalário: " + salario + "\n----------\n\n");
        }

        System.out.print("Total de salários: " + totalSalarios);
        System.out.print("\nTotal de peças produzidas: " + totalPecas);
        System.out.print("\nMédia de peças fabricadas por homens: " + (mediaPecasHomem / contHomem));
        System.out.print("\nMédia de peças fabricada por mulheres: " + (mediaPecasMulheres / contMulher));

        System.out.print("\n\nCódigo do operário com maior salário: " +codigoOperarioMaiorSalario);
        
		sc.close();
	}
}