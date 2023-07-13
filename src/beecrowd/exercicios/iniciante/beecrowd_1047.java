package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        // Calcula a duração em minutos
        int duracaoMinutos = ((horaFinal * 60) + minutoFinal) - ((horaInicial * 60) + minutoInicial);

        // Se a duração for negativa, significa que o jogo ultrapassou o dia seguinte
        if (duracaoMinutos < 0) {
            duracaoMinutos += 24 * 60;
        }

        // Calcula a duração em horas e minutos
        int duracaoHoras = duracaoMinutos / 60;
        int duracaoMinutosRestantes = duracaoMinutos % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutosRestantes);
    }
}

