package beecrowd.exercicios.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1040 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double nota_1 = sc.nextDouble();
        double nota_2 = sc.nextDouble();
        double nota_3 = sc.nextDouble();
        double nota_4 = sc.nextDouble();

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 4;
        int peso4 = 1;

        double media = (nota_1 * peso1 + nota_2 * peso2 + nota_3 * peso3 + nota_4 * peso4) / (peso1 + peso2 + peso3 + peso4);

        System.out.printf("Media: %.1f\n", media);

        if (media < 5) {
            System.out.println("Aluno reprovado");
        } else if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media >= 5 || media <= 6.9) {
            System.out.println("Aluno em exame");

            System.out.print("Nota exame: ");
            double notaExame = sc.nextDouble();

            double mediaExame = (media + notaExame) / 2;

            if (mediaExame >= 5) {
                System.out.println("Aluno aprovado");
            } else if (mediaExame <= 4.9) {
                System.out.println("Aluno reprovado");
            }
            System.out.printf("Media final: %.1f", mediaExame);

        }
        sc.close();
    }

}




