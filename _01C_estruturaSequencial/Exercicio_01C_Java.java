package _01C_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_01C_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("insira a sua idade aqui");
        x = sc.nextDouble();
        y = (365 * x);
        System.out.println("dias vividos aproximadamente: "+y);
    }
}
