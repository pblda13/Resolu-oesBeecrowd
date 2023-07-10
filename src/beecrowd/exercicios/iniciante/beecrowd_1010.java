package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); // Configura o ponto como separador decimal

        System.out.println("Quantas peças?");
        int numeroDePecas = sc.nextInt();
         int cont = 0;
        double valorFinal =0;
        while (cont < numeroDePecas){
            cont++;
            System.out.println("Digite o código da peça " + cont);
            int codigo = sc.nextInt();
            System.out.println("Digite o número de peças " );
            int numpecas = sc.nextInt();
            System.out.println("Digite o valor unitário de cada peça " );
            double precoPecas = sc.nextDouble();

           double precoCadaPeca = numpecas *precoPecas;
            valorFinal += precoCadaPeca;

        }

        System.out.printf("VALOR A PAGAR: R$  %.2f" ,valorFinal);
    }
}
