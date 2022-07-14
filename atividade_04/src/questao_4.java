import java.util.Scanner;

public class questao_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira o hor�rio de in�cio do jogo: ");
        System.out.print("\nHora: ");
        int horaInicio = sc.nextInt();
        
        System.out.print("Minuto: ");
        int minutoInicio = sc.nextInt();
        
        System.out.print("\nInsira o hor�rio de t�rmino do jogo: ");
        System.out.print("\nHora: ");
        int horaTermino = sc.nextInt();
        
        System.out.print("Minuto: ");
        int minutoTermino = sc.nextInt();

        int duracaoHora = horaTermino - horaInicio;
        
        int duracaoMinuto = minutoTermino - minutoInicio;

        if(duracaoHora < 0){
            duracaoHora = 24 + duracaoHora;
        }else if(duracaoMinuto < 0){
            duracaoHora = duracaoHora - 1;
            duracaoMinuto = 60 + duracaoMinuto;
        }

        System.out.print("\nDura��o da partida: " + duracaoHora + ":" + duracaoMinuto);

        sc.close();
    }
}
