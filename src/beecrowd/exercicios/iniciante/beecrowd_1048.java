package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1048 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double novoSalario;
        double reajuste;
        int percentualReajuste;

        if (salario <= 400.00) {
            percentualReajuste = 15;
        } else if (salario <= 800.00) {
            percentualReajuste = 12;
        } else if (salario <= 1200.00) {
            percentualReajuste = 10;
        } else if (salario <= 2000.00) {
            percentualReajuste = 7;
        } else {
            percentualReajuste = 4;
        }
        reajuste = salario * (percentualReajuste / 100.0);
        novoSalario = salario + reajuste;


        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual %d %%", novoSalario, reajuste,percentualReajuste);
    }
}
