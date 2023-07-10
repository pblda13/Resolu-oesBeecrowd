package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1015 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

    System.out.println("Digite as coordenadas x,y ,do ponto (x1,y1)");
    String ponto1 =sc.nextLine();
    String[] valores_1 = ponto1.split(" ");

    double x1 = Double.parseDouble(valores_1[0]);
    double y1 = Double.parseDouble(valores_1[1]);

        System.out.println("Digite as coordenadas x,y ,do ponto (x2,y2)");
        String ponto2 =sc.nextLine();
        String[] valores_2 = ponto2.split(" ");

        double x2 = Double.parseDouble(valores_2[0]);
        double y2 = Double.parseDouble(valores_2[1]);

        double distancia = Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2)));

        System.out.printf("%.4f",distancia);


    }
}
