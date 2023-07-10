package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância em quilômetros: ");
        int distancia = sc.nextInt();

        int velocidadeX = 60; // velocidade do carro X em Km/h
        int velocidadeY = 90; // velocidade do carro Y em Km/h

        int tempo = (distancia * 60) / (velocidadeY - velocidadeX); // convertendo o tempo para minutos

        System.out.println(tempo + " minutos");
    }
}
