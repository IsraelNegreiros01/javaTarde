package _01C_estruturaSequencial;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Exercicio_08C_Java {
    public static void main(String[] args) {
        double C, P;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi o valor da compra");
        C = sc.nextDouble();
        System.out.println();
        P = (C/3);
        System.out.println("O valor da parcela e três é: "+ P);
    }
}