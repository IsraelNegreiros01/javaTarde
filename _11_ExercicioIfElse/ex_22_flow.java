package br.com.javatarde;

import java.util.Scanner;

public class ex_22_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            double x;
            System.out.println("programa iniciado, insira o indice de particulas");
            x = sc.nextDouble();
            if (x < 50) {
                System.out.println("qualidade boa");
            } else if (x > 200) {
                System.out.println("qualidade critica");
            } else if (x >= 100 && x < 200) {
                System.out.println("qualidade ruim");
            } else {
                System.out.println("qualidade moderada");
            }
        }
    }
}