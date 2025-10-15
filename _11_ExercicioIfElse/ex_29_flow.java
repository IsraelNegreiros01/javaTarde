package br.com.javatarde;

import java.util.Scanner;

public class ex_29_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira em porcentagem o numero de defeitos");
        x = sc.nextDouble();
        if ( x > 20) {
            System.out.println("reprovar");
        } else if ( x < 10) {
            System.out.println("aprovar");
        }
        else {
            System.out.println("retrabalho");
        }
    }
}
