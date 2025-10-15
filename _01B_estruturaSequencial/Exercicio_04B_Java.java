package _01B_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_04B_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("Insira o valor da base e da altura do triangulo");
        x = sc.nextDouble();
        y = sc.nextDouble();
        System.out.println("o valor da area do triangulo e: "+((x * y)/2));
    }
}
