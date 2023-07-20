package beecrowd.exercicios.iniciante;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class beecrowd_1080 {
    public static void main(String[] args) {

        int[] valores = new int[100];

        Random random = new Random();
        HashSet<Integer> numerosGerados = new HashSet<>();

        // Gerar 100 valores inteiros aleatórios e distintos
        for (int i = 0; i < 100; i++) {
            int valor;
            do {
                valor = random.nextInt(1000); // Gera um número inteiro aleatório entre 0 e 999
            } while (numerosGerados.contains(valor));

            numerosGerados.add(valor);
            valores[i] = valor;
        }

        int maiorValor = valores[0];
        int posicaoMaiorValor = 0;

        // Encontra o maior valor e sua posição
        for (int i = 1; i < 100; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
                posicaoMaiorValor = i;
            }
        }

        // Imprime os resultados
        System.out.println("Valores gerados:");
        for (int i = 0; i < 100; i++) {
            System.out.print(valores[i] + " ");
        }

        System.out.println("\nMaior valor gerado: " + maiorValor);
        System.out.println("Posição do maior valor: " + (posicaoMaiorValor + 1)); // A posição é base 1, não base 0
    }
}
