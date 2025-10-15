package br.com.javatarde;

import java.util.Scanner;

public class ex_21_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira o peso da carga");
        x = sc.nextDouble();
        if ( x < 500) {
            System.out.println("entrada permitida");
        }
        else if (x > 1000) {
            System.out.println("entrada negada");
        }
        else {
            System.out.println("alerta");
        }
    }
}
