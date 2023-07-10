package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); // Configura o ponto como separador decimal

        String nomeFunc = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double vendasNoMes = sc.nextDouble();

        final double comissao = 15.0;

        double totalAReceber = vendasNoMes * (comissao/100);

        double salarioFinal = totalAReceber + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f",salarioFinal);


    }
}
