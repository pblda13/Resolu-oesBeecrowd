package beecrowd.exercicios.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class beecrowd_1042 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int[] valores = new int[3];
       for (int i= 0 ;i < 3; i++){
           valores[i] = sc.nextInt();
       }

       int[] numerosOrdenados = Arrays.copyOf(valores,valores.length);
       Arrays.sort(numerosOrdenados);

        for (int valor : numerosOrdenados ) {
            System.out.println(valor);
        }
        System.out.println();

        for (int valor_2:valores) {
            System.out.println(valor_2);
        }
    }
}
