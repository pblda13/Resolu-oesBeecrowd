package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1073 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int quadrado = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                quadrado = (int) Math.pow(i, 2);
                System.out.println(i + "^2 = " + quadrado);
            }
        }
    }
}
