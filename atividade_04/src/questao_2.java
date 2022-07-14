import java.util.Scanner;

public class questao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mesExtenso = "";

        System.out.print("Dia: ");
        int dia = sc.nextInt();
        
        System.out.print("Mês: ");
        int mesNumeral = sc.nextInt();
        
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        
        System.out.print("Hora: ");
        int hora = sc.nextInt();
        
        System.out.print("Minuto: ");
        int minuto = sc.nextInt();

        if(mesNumeral == 1){
            mesExtenso = "Janeiro";
        } else if(mesNumeral == 2){
            mesExtenso = "Fevereiro";
        } else if(mesNumeral == 3){
            mesExtenso = "Março";
        } else if(mesNumeral == 4){
            mesExtenso = "Abril";
        } else if(mesNumeral == 5){
            mesExtenso = "Maio";
        } else if(mesNumeral == 6){
            mesExtenso = "Junho";
        } else if(mesNumeral == 7){
            mesExtenso = "Julho";
        } else if(mesNumeral == 8){
            mesExtenso = "Agosto";
        } else if(mesNumeral == 9){
            mesExtenso = "Setembro";
        } else if(mesNumeral == 10){
            mesExtenso = "Outubro";
        } else if(mesNumeral == 11){
            mesExtenso = "Novembro";
        } else if(mesNumeral == 12){
            mesExtenso = "Dezembro";
        }

        System.out.println(dia + " / " + mesExtenso + " / " + ano + "	" + hora + " : "  + minuto);
        
        sc.close();
    }
}
