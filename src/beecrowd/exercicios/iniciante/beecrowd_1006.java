package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);// Configurar o uso do separador de ponto

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        double notaC = sc.nextDouble();

        final double pesoA = 2.0;
        final double pesoB = 3.0;
        final double pesoC = 3.0;

        double media = (notaA*pesoA + notaB*pesoB + notaC*pesoC)/(pesoA+pesoB+pesoC);

        System.out.printf("MEDIA = %.1f",media);

        sc.close();
    }
}
