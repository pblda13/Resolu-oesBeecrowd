package beecrowd.exercicios.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beecrowd_1060 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadePositivos = 0;

        for (int i = 0; i < 6; i++) {
            double numero = sc.nextDouble();
            if (numero > 0) {
                quantidadePositivos++;
            }
        }

        System.out.println(quantidadePositivos + " valores positivos");

        sc.close();
    }
}
