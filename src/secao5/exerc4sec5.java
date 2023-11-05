package secao5;

import java.util.Scanner;

public class exerc4sec5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int duracao;

        System.out.println("Digite a hora de inicio do jogo: ");

        int horaInicial = sc.nextInt();

        System.out.println("Digite a hora de término do jogo: ");

        int horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;

        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("A duração do jogo foi: " + duracao + " HORA(S)");

        sc.close();

    }

}
