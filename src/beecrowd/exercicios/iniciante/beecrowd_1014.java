package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a distância percorrida");
        double distanciaPercorrida = sc.nextDouble();
        System.out.println("Digite o total de combustivel gasto ");
        double combustivelGasto = sc.nextDouble();

        double consumoMedio = distanciaPercorrida/combustivelGasto;

        System.out.printf("%.3f km/l",consumoMedio);
    }
}
