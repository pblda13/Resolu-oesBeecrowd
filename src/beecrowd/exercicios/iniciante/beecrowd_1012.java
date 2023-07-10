package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        final  double PI = 3.14159;


        System.out.println("Digite 3 valores");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaTriangulo = (A*C)/2;
        double areaCirculo = PI * Math.pow(C, 2);
        double areaTrapezio = ((A+B)*C)/2;
        double areaQuadrado = Math.pow(B,2);
        double areaRetangulo = A*B;

        System.out.printf("TRIANGULO: %.3f",areaTriangulo);
        System.out.printf("\nCIRCULO: %.3f",areaCirculo);
        System.out.printf("\nTRAPEZIO: %.3f",areaTrapezio);
        System.out.printf("\nQUADRADO: %.3f",areaQuadrado);
        System.out.printf("\nRETANGULO: %.3f",areaRetangulo);


    }
}
