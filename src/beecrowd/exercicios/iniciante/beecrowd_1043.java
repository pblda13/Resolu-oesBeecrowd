package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1043 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (formaTriangulo(a, b, c)) {
            double perimetro = calcularPerimetro(a, b, c);
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            double area = calcularAreaTrapezio(a, b, c);
            System.out.printf("Area = %.1f\n", area);
        }

        sc.close();
    }

    private static boolean formaTriangulo(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static double calcularPerimetro(double a, double b, double c) {
        return a + b + c;
    }

    private static double calcularAreaTrapezio(double a, double b, double c) {
        return ((a + b) * c) / 2.0;
    }
}

