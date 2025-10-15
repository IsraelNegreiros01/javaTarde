package br.com.javatarde;

import java.util.Scanner;

public class ex_19_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira o ph do liquido");
        x = sc.nextDouble();
        if ( x > 7) {
            System.out.println("ph normal");
        } else if (x < 7) {
            System.out.println("ph acido");
        } else if (x == 7) {
            System.out.println("ph neutro");
        }
        else {
            System.out.println("erro");
        }

    }
}
