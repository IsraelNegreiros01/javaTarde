package br.com.JavaTarde;

import java.util.Scanner;

public class ex_30_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira a temperatura atual da maquina");
        x = sc.nextDouble();
        if ( x > 80) {
            System.out.println("desligar servidores");
        } else if ( x < 60) {
            System.out.println("normal");
        }
        else {
            System.out.println("resfriamento extra");
        }
    }
}
