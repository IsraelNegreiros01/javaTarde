package br.com.javatarde;

import java.util.Scanner;

public class ex_28_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, analisar a situacao da estrada");
        x = sc.nextDouble();
        if ( x == 1) {
            System.out.println("recalcular rotas");
        } else if ( x == 2) {
            System.out.println("rota alternativa");
        }
        else {
            System.out.println("seguir normal");
        }
    }
}
