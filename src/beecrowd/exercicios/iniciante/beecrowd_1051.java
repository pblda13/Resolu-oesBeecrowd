package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1051 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double imposto;

        if (salario <= 2000.00) {
            imposto = 0.00;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            imposto = 1000.00 * 0.08 + (salario - 3000.00) * 0.18;
        } else {
            imposto = 1000.00 * 0.08 + 1500.00 * 0.18 + (salario - 4500.00) * 0.28;
        }

        if (imposto == 0.00) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}

