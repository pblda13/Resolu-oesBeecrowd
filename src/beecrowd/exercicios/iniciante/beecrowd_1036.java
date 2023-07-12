package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1036 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = Math.pow(B,2)-4*A*C;

        if(A == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }
        else {

            double raiz_1 = (-B + Math.sqrt(delta))/(2*A);
            double raiz_2 = (-B - Math.sqrt(delta))/(2*A);

            System.out.printf("R1 = %.5f \nR2 = %.5f",raiz_1,raiz_2);
        }
    }
}
