package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);// Configurar o uso do separador de ponto

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();

        final double pesoA = 3.5;
        final double pesoB = 7.5;

        // Calcula a média ponderada  = (x₁ * p₁ + x₂ * p₂ + ... + xn * pn) / (p₁ + p₂ + ... + pn)
        double media = (notaA*pesoA+ notaB*pesoB)/(pesoA+pesoB);

        System.out.printf("MEDIA = %.5f",media);

        sc.close();
    }
}
