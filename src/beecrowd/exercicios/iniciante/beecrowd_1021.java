package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1021 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor de ponto flutuante com duas casas decimais: ");
        double valor = sc.nextDouble();

        int valorInteiro = (int) valor; // parte inteira do valor
        double valorDecimal = valor - valorInteiro; // parte decimal do valor

        // Cálculo das notas
        int notas100 = valorInteiro / 100;
        valorInteiro %= 100;
        int notas50 = valorInteiro / 50;
        valorInteiro %= 50;
        int notas20 = valorInteiro / 20;
        valorInteiro %= 20;
        int notas10 = valorInteiro / 10;
        valorInteiro %= 10;
        int notas5 = valorInteiro / 5;
        valorInteiro %= 5;
        int notas2 = valorInteiro / 2;

        // Cálculo das moedas
        int moedas1 = valorInteiro % 2;
        int moedas050 = (int) (valorDecimal / 0.50);
        valorDecimal %= 0.50;
        int moedas025 = (int) (valorDecimal / 0.25);
        valorDecimal %= 0.25;
        int moedas010 = (int) (valorDecimal / 0.10);
        valorDecimal %= 0.10;
        int moedas005 = (int) (valorDecimal / 0.05);
        valorDecimal %= 0.05;
        int moedas001 = (int) Math.round(valorDecimal / 0.01);

        System.out.println("NOTAS");
        System.out.println(notas100 + " nota(s) de 100");
        System.out.println(notas50 + " nota(s) de 50");
        System.out.println(notas20 + " nota(s) de 20");
        System.out.println(notas10 + " nota(s) de 10");
        System.out.println(notas5 + " nota(s) de 5");
        System.out.println(notas2 + " nota(s) de 2");
        System.out.println(moedas1 + " moeda(s) de 1");
        System.out.println(moedas050 + " moeda(s) de 0.50");
        System.out.println(moedas025 + " moeda(s) de 0.25");
        System.out.println(moedas010 + " moeda(s) de 0.10");
        System.out.println(moedas005 + " moeda(s) de 0.05");
        System.out.println(moedas001 + " moeda(s) de 0.01");


    }
}
