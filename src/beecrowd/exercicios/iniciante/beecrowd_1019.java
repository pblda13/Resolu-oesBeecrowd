package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo em segundos: ");
        int tempoTotalSegundos = sc.nextInt();

        int horas = tempoTotalSegundos / 3600; // calcula o número de horas
        int minutos = (tempoTotalSegundos % 3600) / 60; // calcula o número de minutos
        int segundos = tempoTotalSegundos % 60; // calcula o número de segundos

        System.out.printf("%2d:%2d:%2d", horas, minutos, segundos);

    }
}
