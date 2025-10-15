package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_02_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual o valor do raio:");
        double n1 = sc .nextDouble();
        double resultado = 3.14159*(n1 * n1);
        System.out.printf("a area é" + resultado);
    }
}

