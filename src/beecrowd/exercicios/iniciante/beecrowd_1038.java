package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1038 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int coder = sc.nextInt();
        int quant = sc.nextInt();
        double valor;

        switch (coder){
            case 1:
                valor = 4.00;
                double total = valor *quant;
                System.out.printf("Total: R$ %.2f",total);
                break;
            case  2:
                 valor = 4.50;
                 total = valor *quant;
                System.out.printf("Total: R$ %.2f",total);
                break;
            case 3:
                valor = 5.00;
                total = valor *quant;
                System.out.printf("Total: R$ %.2f",total);
                break;
            case 4:
                valor = 2.00;
                total = valor *quant;
                System.out.printf("Total: R$ %.2f",total);
                break;
            case 5:
                valor = 1.50;
                total = valor *quant;
                System.out.printf("Total: R$ %.2f",total);
                break;
            default:
                System.out.println("Codigo Invalido");
        }
    }
}
