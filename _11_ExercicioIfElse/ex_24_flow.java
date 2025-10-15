package br.com.javatarde;

import java.util.Scanner;

public class ex_24_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira a quantidade de produtos dispoiniveis no estoque");
        x = sc.nextDouble();
        if ( x < 10) {
            System.out.println("reeabastecer urgente");
        } else if ( x > 30) {
            System.out.println("normal");
        }
else {
            System.out.println("alerta");}
}
}
