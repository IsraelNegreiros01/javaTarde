package br.com.javatarde;

import java.util.Scanner;

public class ex_26_flow {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double x;
        System.out.println("programa iniciado, insira a porcentagem de tinta restante");
        x = sc.nextDouble();
        if ( x < 15) {
            System.out.println("parar robo");
        } else if ( x > 50) {
            System.out.println("continuar pintura");
        }
        else {
            System.out.println("alerta");
        }
    }
}
