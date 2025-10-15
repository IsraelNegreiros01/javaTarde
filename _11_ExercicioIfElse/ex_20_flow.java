package br.com.javatarde;

import java.util.Scanner;

public class ex_20_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, indique o horario do seu turno");
        x = sc.nextDouble();
        if ( x < 12) {
            System.out.println("turno da manha");
        } else if (x > 18) {
            System.out.println("turno da noite");
        }
        else {
            System.out.println("turno da tarde");
        }
    }
}
