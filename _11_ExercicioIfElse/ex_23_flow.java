package br.com.javatarde;

import java.util.Scanner;

public class ex_23_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira, em porcentagem,a situacao do trafego");
        x = sc.nextDouble();
        if ( x > 70) {
            System.out.println("bloquear acesso");
        } else if (x < 30) {
            System.out.println("trafego normal");
        }
        else {
            System.out.println("alerta");
        }
    }


}
