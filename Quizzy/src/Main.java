import java.util.Scanner;

public class Main {
    /**
     * @author Bruna Drews e Camilly Pessotti
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("BEM-VINDO AO QUIZZY!\nO quiz de conhecimentos gerais...");

        System.out.print("\n\nAntes de começarmos, qual o seu nome?\n> ");
        String nome = sc.next();

        System.out.print("\nMuito bem " + nome + ", agora sim podemos começar.\n"
                + "\nVou te explicar como nosso quiz funciona: o mesmo é"
                + "\nconstituído de 10 perguntas e você precisa acertar"
                + "\nno mínimo 6 para passar. As perguntas são variadas"
                + "\nsobre conhecimentos gerais, vão desde um português"
                + "\nsimples a perguntas sobre o espaço. É isso aí, acho"
                + "\nque você já sabe de tudo que precisa para começar."
                + "\n\nBoa sorte!");

        System.out.print("\n\nPreparado?\n1 - Sim\n2 - Não\n> ");
        int inicio = sc.nextInt();

        switch (inicio) {
            case 1:
                int cont = 0;

                System.out.print("\n1 - Qual o menor e o maior país do mundo?"
                        + "\na) Vaticano e Rússia"
                        + "\nb) Nauru e China"
                        + "\nc) Mônaco e Canadá"
                        + "\nd) Malta e Estados Unidos"
                        + "\ne) São Marino e Índia"
                        + "\n> ");
                String p1 = sc.next();

                if (p1.equals("a")) {
                    System.out.print("\nParabéns, você acertou!");
                    cont++;
                } else {
                    System.out.print("\nAlternativa certa: a) Vaticano e Rússia.\nO Vaticano, sede da igreja católica, tem apenas 44 hectares (0,44 km²). A Rússia, localizada em dois continentes (Ásia e Europa), tem 17 milhões de km².");
                }

                System.out.print("\n\n2- O que é mais pesado:"
                        + "\na) 1 quilo de algodão"
                        + "\nb) 1 quilo de ferro"
                        + "\nc) ambos"
                        + "\n> ");
                String p2 = sc.next();

                if (p2.equals("c")) {
                    System.out.print("\nParabéns, você acertou!");
                    cont++;
                } else {
                    System.out.print("\nAlternativa certa: c) Ambos.\nAmbos têm o mesmo peso: 1 quilo. Mas, como precisamos de uma porção de algodão maior para compor 1 quilo, temos a sensação de que o mesmo peso de algodão é mais leve do que o chumbo.");
                }

                System.out.print("\n\n3- Qual o maior planeta do sistema solar?"
                        + "\na) Marte"
                        + "\nb) Lua"
                        + "\nc) Saturno"
                        + "\nd) Terra"
                        + "\ne) Júpiter"
                        + "\n> ");
                String p3 = sc.next();

                if (p3.equals("e")) {
                    System.out.print("\nParabéns, você acertou!");
                    cont++;
                } else {
                    System.out.print("\nAlternativa certa: e) Júpiter.\nJúpiter é 1300 vezes maior que a Terra, sendo o maior planeta do sistema solar.");
                }

                System.out.print("\n\n4- Quantas vezes o Brasil foi campeão da Copa do Mundo?"
                        + "\n> ");
                int p4 = sc.nextInt();

                if (p4 == 5) {
                    System.out.print("\nParabéns, você acertou!");
                    cont++;
                } else {
                    System.out.print("\nResposta certa: 5\nO Brasil é o único pentacampeão da competição, tendo vencido cinco vezes, nos anos de 1958, 1962, 1970, 1994 e 2002.");
                }

                System.out.print("\n\n5- Qual a maior floresta tropical do mundo?"
                        + "\na) Mata Atlântica"
                        + "\nb) Pampas"
                        + "\nc) Pantanal"
                        + "\nd) Floresta Amazônica"
                        + "\ne) Caatinga"
                        + "\n> ");
                String p5 = sc.next();

                if (p5.equals("d")) {
                    System.out.print("\nParabéns, você acertou!");
                    cont++;
                } else {
                    System.out.print("\nAlternativa certa: d) Floresta Amazônica.\nA Floresta Amazônica ocupa quase 50 % do território brasileiro e, além do Brasil, também está presente em mais 8 países: Bolívia, Colômbia, Equador, Venezuela, Guiana, Guiana Francesa, Peru e Suriname.");
                }

                System.out.print("\n\n6- Qual o grupo em que todas as palavras foram escritas corretamente?"
                        + "\na) Asterístico, beneficiente, meteorologia, entertido"
                        + "\nb) Asterisco, beneficente, meteorologia, entretido"
                        + "\nc) Asterisco, beneficente, metereologia, entretido"
                        + "\nd) Asterístico, beneficiente, metereologia, entretido"
                        + "\ne) Asterisco, beneficiente, metereologia, entretido"
                        + "\n> ");
                String p6 = sc.next();

                if (p6.equals("b")) {
                    System.out.print("\nParabéns, você acertou!");
                    cont++;
                } else {
                    System.out.print("\nAlternativa certa: b) Asterisco, beneficente, meteorologia, entretido.\nEstas palavras são exemplos de barbarismo, um vício de linguagem em que as palavras são pronunciadas ou escritas incorretamente.");
                }

                System.out.print("\n\nEssa é muito fácil! Você só vai sair dela quando acertá-la!");

                int p7;
                do {
                    System.out.print("\n7 - Quanto é 3457 - 2426?"
                            + "\n> ");
                    p7 = sc.nextInt();
                } while (p7 != 1031);
                cont++;

                System.out.print("\n8- O que a palavra legend significa em português?"
                        + "\na) Legenda"
                        + "\nb) Conto"
                        + "\nc) História"
                        + "\nd) Lenda"
                        + "\ne) Legendário"
                        + "\n> ");
                String p8 = sc.next();

                if (p8.equals("d")) {
                    System.out.print("\nParabéns, você acertou!");
                    cont++;
                } else {
                    System.out.print("\nAlternativa certa: d) Lenda.\nLegend, que parece significar “legenda”, faz parte do grupo dos falsos cognatos. Falsos cognatos são palavras de línguas distintas que apresentam semelhanças na grafia e/ou na pronúncia, mas cujos significados são diferentes. Outros exemplos são: costume, que significa fantasia, e to push, que significa empurrar.");
                }
                System.out.print("\n\n9- Quanto tempo a luz do Sol demora para chegar à Terra?"
                        + "\na) 12 minutos"
                        + "\nb) 1 dia"
                        + "\nc) 12 horas"
                        + "\nd) 8 minutos"
                        + "\ne) segundos"
                        + "\n> ");
                String p9 = sc.next();

                if (p9.equals("d")) {
                    System.out.print("\nParabéns, você acertou!");
                    cont++;
                } else {
                    System.out.print("\nAlternativa certa: d) 8 minutos.\nEssa é uma questão que se fundamenta na ótica. Ela é calculada com base na distância do Sol em relação à Terra, que é de aproximadamente 150.000.000 km, considerando que a velocidade da luz no vácuo é 300.000 Km/s.\n150.000.000 dividido por 300.000 é igual a 500 segundos, ou seja, 8,33 minutos.\r\n");
                }
                System.out.print("\n\n10- O que é maior?"
                        + "\na) gigabyte"
                        + "\nb) megabyte?"
                        + "\n> ");
                String p10 = sc.next();

                if (p10.equals("a")) {
                    System.out.print("\nParabéns, você acertou!");
                    cont++;
                } else {
                    System.out.print("\nAlternativa certa: a) gigabyte\nO gigabyte é maior do que o megabyte. Um gigabyte equivale a 1024 megabytes.");
                }

                System.out.print("\n\nParabéns! Você conseguiu chegar ao final!\nSua pontuação: " + cont + "\n");
                break;

            case 2:
                System.out.print("\nQue pena! Vamos parar por aqui então...");
                System.exit(0);
                break;

            default:
                System.out.print("\nOpção inválida! Tente novamente: \n\n");
                main(args);
                break;
        }
    }
}