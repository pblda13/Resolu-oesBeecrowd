package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int quantidadePositivo = 0;
        int quantidadeNegativo = 0;

        for (int i = 0; i < 5; i++) {
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }

            if (numero > 0) {
                quantidadePositivo++;
            } else if (numero < 0) {
                quantidadeNegativo++;
            }
        }

        System.out.println(quantidadePares + " valor(es) par(es)");
        System.out.println(quantidadeImpares + " valor(es) impar(es)");
        System.out.println(quantidadePositivo + " valor(es) positivo(s)");
        System.out.println(quantidadeNegativo + " valor(es) negativo(s)");

        sc.close();
    }
}

