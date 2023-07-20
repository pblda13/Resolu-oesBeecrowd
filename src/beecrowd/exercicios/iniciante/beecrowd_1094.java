package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1094 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalDeCobaias = 0;
        int totalDeCoelhos = 0;
        int totalDeRatos = 0;
        int totalDeSapos = 0;

        int N = sc.nextInt();

        for (int i = 1;i <= N;i++){
            int quantidade = sc.nextInt();
            char tipo = sc.next().charAt(0);

            totalDeCobaias += quantidade;

            switch (tipo){
                case 'S':
                    totalDeSapos += quantidade;
                    break;
                case 'R':
                    totalDeRatos += quantidade;
                    break;
                case 'C':
                    totalDeCoelhos += quantidade;
                    break;
                default:
                    break;
            }
        }

        double percentualSapos = (double) totalDeSapos / totalDeCobaias * 100;
        double percentualRatos = (double) totalDeRatos / totalDeCobaias * 100;
        double percentualCoelhos = (double) totalDeCoelhos / totalDeCobaias * 100;


        System.out.println("Total: " + totalDeCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalDeCoelhos);
        System.out.println("Total de ratos: " + totalDeRatos);
        System.out.println("Total de sapos: " + totalDeSapos);
        System.out.printf("Percentual de coelhos: %.2f%%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f%%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f%%\n", percentualSapos);

    }
}
