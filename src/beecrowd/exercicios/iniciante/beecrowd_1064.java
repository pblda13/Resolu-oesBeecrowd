package beecrowd.exercicios.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beecrowd_1064 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadePositivos = 0;
        double somaPositivos = 0;

        for (int i = 0; i < 6; i++) {
            double numero = sc.nextDouble();
            if (numero > 0) {
                quantidadePositivos++;
                somaPositivos += numero;
            }
        }

        double mediaPositivos = somaPositivos / quantidadePositivos;

        System.out.println(quantidadePositivos + " valores positivos");
        System.out.printf("%.1f%n", mediaPositivos);

        sc.close();
    }
}
