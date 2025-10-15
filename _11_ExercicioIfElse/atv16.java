package br.com.javatarde;

import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("programa iniciado, classifique abaixo o defeito das pecas em 1, 2 ou 3");
        double x = sc.nextDouble();
        if (x == 1) {
            System.out.println("defeitos visiveis");
        }
        else if (x == 2) {
            System.out.println("defeitos microscopicos");
        }
        else {
            System.out.println("defeito ausente");
        }
    }
}
