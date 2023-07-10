package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade em dias: ");
        int idadeDias = sc.nextInt();

        int anos = idadeDias / 365; // calcula o número de anos
        int meses = (idadeDias % 365) / 30; // calcula o número de meses
        int dias = (idadeDias % 365) % 30; // calcula o número de dias

        System.out.printf("%d ano(s)%n%d mês(es)%n%d dia(s)", anos, meses, dias);
    }

}
