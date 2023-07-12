package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1035 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int somaAB = A+B;
        int somaCD = C+D;

        if (B > C && D > A){
            if(somaCD > somaAB){
                System.out.println("Valores aceitos");
            }
        }
        else {
            System.out.println("Valores não aceitos");
        }
    }
}
