package _01C_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_03C_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("digite o valor do produto");
        x = sc.nextDouble();
        y = ((x/100) * 15);
        System.out.println("valor total a ser pago: "+(x + y));
    }
}
