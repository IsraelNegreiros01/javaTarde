package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_03_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        System.out.println("Digite o primeiro numero");
        a = sc.nextDouble();
        System.out.println("Digite o segundo numero");
        b = sc.nextDouble();
        System.out.println("Digite o terceiro numero");
        c = sc.nextDouble();
        System.out.println("Digite o quarto numero");
        d = sc.nextDouble();
        double resposta = a * b - c * d;
        System.out.printf("a diferença é " + resposta);
    }
}
