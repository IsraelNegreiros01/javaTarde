package _01C_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_10C_Java {
    public static void main(String[] args) {
        double A, P, C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua altura?");
        A = sc.nextDouble();
        System.out.println();
        P = (72.7 * A) - 58;
        System.out.printf("Seu peso ideal é: "+ P);
        sc.close();

    }
}
