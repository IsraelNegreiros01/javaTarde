package br.com.javatarde;

import java.util.Scanner;

public class ex_25_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira a quantidade de ampares");
        x = sc.nextDouble();
        if (x < 100) {
            System.out.println("intensidade baixa");
        } else if (x > 200) {
            System.out.println("intensidade forte");
        } else {
            System.out.println("intensidade media");
        }
    }
}