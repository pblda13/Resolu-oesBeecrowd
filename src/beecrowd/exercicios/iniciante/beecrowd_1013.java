package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite 3 valores");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        int maiorAB = (A+B +Math.abs(A-B))/2;
        int maior = (maiorAB + C  + Math.abs(maiorAB-C))/2;

        System.out.println(maior +" eh o maior");
    }
}
