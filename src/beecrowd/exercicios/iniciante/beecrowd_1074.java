package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1074 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int n1 = sc.nextInt();

            if (n1 == 0) {
                System.out.println("NULL");

            } else if (n1 % 2 == 0) {
                if (n1 > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }

            } else {
                if (n1 > 0) {
                    System.out.println("ODD POSITIVE");

                } else {
                    System.out.println("ODD NEGATIVE");
                }

            }
        }
    }
}
