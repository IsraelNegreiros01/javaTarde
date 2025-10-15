package _01C_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_04C_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z;
        int a;
        System.out.println("digite o valor do primeiro numero");
        x = sc.nextDouble();
        System.out.println("digite o valor do segundo numero");
        y = sc.nextDouble();
        z = ((x * 3) + (y * 2));
        a = (int) (z / 3);
        System.out.println("valor da media ponderada: "+a);
    }
}
