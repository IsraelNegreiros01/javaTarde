package br.com.javatarde;

import java.util.Scanner;

public class Ex_17_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, me diga o robo A falhou?");
        x = sc.nextDouble();
        if ( x == 1) {
            System.out.println("acionar robo B");
            System.out.println("e o robo B, falhou?");
        }
        else {
            System.out.println("ok");
        }
        x = sc.nextDouble();
        if ( x == 1);{
            System.out.println("parar os dois robos");
        }
    }
}
