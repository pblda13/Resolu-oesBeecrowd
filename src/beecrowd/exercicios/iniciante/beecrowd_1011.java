package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1011 {
    public static void main(String[] args) {

        final double PI= 3.14159;

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o número do raio");
        double raio = sc.nextDouble();

        double volume = (4/3.0)* PI * Math.pow(raio,3);

        System.out.printf("VOLUME = %.3f",volume);


    }
}
