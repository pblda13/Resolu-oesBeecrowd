package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1071 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int soma = 0;
        int inicio, fim;

        if (x < y) {
            inicio = x;
            fim = y;
        } else {
            inicio = y;
            fim = x;
        }

        for (int i = inicio + 1; i < fim; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
