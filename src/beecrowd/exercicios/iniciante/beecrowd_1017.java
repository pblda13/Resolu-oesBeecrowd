package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o tempo gasto (horas)");
        double tempoGasto = sc.nextDouble();
        System.out.println("Digite a velocidade média (km/h)");
        double velocidadeMedia = sc.nextDouble();

        final  double eficienciaDoVeiculo = 12.0;
        double litrosNecessarios = ((tempoGasto*velocidadeMedia)/eficienciaDoVeiculo);

        System.out.printf("%.3f ",litrosNecessarios);

    }
}
