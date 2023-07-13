package beecrowd.exercicios.iniciante;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class beecrowd_1045 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores de entrada
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Ordenação dos valores em ordem decrescente
        double[] valores = {a, b, c};
        Arrays.sort(valores);

        // Atribuição dos valores ordenados às variáveis a, b, c
        a = valores[2];
        b = valores[1];
        c = valores[0];

        // Verificação se forma um triângulo
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Verificação do tipo de triângulo
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // Verificação dos tipos especiais de triângulo
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }

}
