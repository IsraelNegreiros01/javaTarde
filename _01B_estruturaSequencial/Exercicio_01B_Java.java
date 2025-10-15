package _01B_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_01B_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o primeiro numero");
        double x;
        x = sc.nextDouble();
        System.out.println("insira o segundo numero");
        double y;
        y = sc.nextDouble();
        System.out.println("soma dos dois valores: "+(x+y));
    }
}
