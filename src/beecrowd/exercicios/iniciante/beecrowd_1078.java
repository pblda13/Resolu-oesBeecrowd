package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1078 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mult = 0;

        for (int i = 1; i <= 10; i++) {

            mult = n * i;

            System.out.println(i + " x " + n + " = " + mult);
        }
    }
}
