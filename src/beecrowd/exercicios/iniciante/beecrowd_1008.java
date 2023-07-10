package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); // Configura o ponto como separador decimal

        int numFunc = sc.nextInt();
        int horasTrab = sc.nextInt();
        double valorHorasTrabalhadas = sc.nextDouble();

        double salary = horasTrab * valorHorasTrabalhadas;

        System.out.printf("NUMBER = "+numFunc+"\n"+ "SALARY = U$ %.2f" , salary);


        sc.close();
    }
}
