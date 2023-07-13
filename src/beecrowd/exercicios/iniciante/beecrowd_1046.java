package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1046 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial < horaFinal){

            duracao = horaInicial-horaFinal;
        }else {

            duracao = 24 - horaInicial+horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
    }
}
