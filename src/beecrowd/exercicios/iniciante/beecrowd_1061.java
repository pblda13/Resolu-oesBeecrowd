package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dados de entrada
        sc.next(); // Descarta a palavra "Dia"
        int diaInicio = sc.nextInt();
        int horaInicio = sc.nextInt();
        int minutoInicio = sc.nextInt();
        int segundoInicio = sc.nextInt();

        sc.next(); // Descarta a palavra "Dia"
        int diaTermino = sc.nextInt();
        int horaTermino = sc.nextInt();
        int minutoTermino = sc.nextInt();
        int segundoTermino = sc.nextInt();

        // Cálculo da duração do evento
        int duracaoSegundos = calcularDuracaoSegundos(diaInicio, horaInicio, minutoInicio, segundoInicio,
                diaTermino, horaTermino, minutoTermino, segundoTermino);

        // Conversão da duração para dias, horas, minutos e segundos
        int duracaoDias = duracaoSegundos / (24 * 60 * 60);
        duracaoSegundos %= (24 * 60 * 60);
        int duracaoHoras = duracaoSegundos / (60 * 60);
        duracaoSegundos %= (60 * 60);
        int duracaoMinutos = duracaoSegundos / 60;
        duracaoSegundos %= 60;

        // Exibição da duração do evento
        System.out.println(duracaoDias + " dia(s)");
        System.out.println(duracaoHoras + " hora(s)");
        System.out.println(duracaoMinutos + " minuto(s)");
        System.out.println(duracaoSegundos + " segundo(s)");

        sc.close();
    }

    public static int calcularDuracaoSegundos(int diaInicio, int horaInicio, int minutoInicio, int segundoInicio,
                                              int diaTermino, int horaTermino, int minutoTermino, int segundoTermino) {
        int segundosInicio = calcularSegundosTotal(diaInicio, horaInicio, minutoInicio, segundoInicio);
        int segundosTermino = calcularSegundosTotal(diaTermino, horaTermino, minutoTermino, segundoTermino);
        return segundosTermino - segundosInicio;
    }

    public static int calcularSegundosTotal(int dia, int hora, int minuto, int segundo) {
        return (dia * 24 * 60 * 60) + (hora * 60 * 60) + (minuto * 60) + segundo;
    }
    }

