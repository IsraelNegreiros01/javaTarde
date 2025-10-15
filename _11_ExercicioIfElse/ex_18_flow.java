package br.com.javatarde;

import java.util.Scanner;

public class ex_18_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira aqui a quantidade de energia solar disponivel");
        x = sc.nextDouble();
        if (x > 70) {
            System.out.println("usar energia solar");
        } else if (x < 30) {
            System.out.println("usar rede eletrica");
        } else {
            System.out.println("usar hibrido");
        }
    }
    }

