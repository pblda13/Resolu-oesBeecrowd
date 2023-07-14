package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1072 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cont = 0;
        int dentro = 0;
        int fora = 0;

        while (cont < n) {

            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                dentro++;
            } else {
                fora++;
            }
            cont++;
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");
    }
}
