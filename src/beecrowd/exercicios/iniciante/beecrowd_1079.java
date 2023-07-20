package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1079 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1;i <= n;i++){

            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double mediaPond = (nota1 * 2 + nota2*3 + nota3 *5)/10;
            System.out.printf("%.1f",mediaPond);
            }


        }
    }

