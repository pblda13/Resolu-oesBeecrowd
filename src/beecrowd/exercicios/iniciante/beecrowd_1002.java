package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double n = 3.14159;

        double raio = sc.nextDouble();

        double area = n * (Math.pow(raio, 2));

        System.out.printf("A=%.4f", area);

        sc.close();
    }
}
