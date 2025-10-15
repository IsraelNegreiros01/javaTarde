package _01C_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_02C_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("digite a hora exata de agora");
        x = sc.nextDouble();
        y = (x * 60);
        System.out.println("hora exata em minutos: "+y);
    }
}
