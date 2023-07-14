package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadePares = 0;

        for (int i = 0; i < 5; i++) {
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                quantidadePares++;
            }
        }

        System.out.println(quantidadePares + " valores pares");

        sc.close();
    }
}

