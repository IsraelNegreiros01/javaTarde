package br.com.javatarde;

import java.util.Scanner;

public class ex_27_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira a situacao da producao");
        x = sc.nextDouble();
        if ( x == 1) {
            System.out.println("parar producao");
        } else if ( x == 2) {
            System.out.println("acionar manutencao");
        }
        else {
            System.out.println("continuar producao");
        }
    }
}
