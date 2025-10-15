package _01C_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_05C_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z;
        System.out.println("insira o valor do lado do quadrado");
        x = sc.nextDouble();
        y = (x * x);
        z = (x * 4);
        System.out.println("valor da area do quadrado: "+y);
        System.out.println("valor do perimetro do quadrado: "+z);
    }
}
