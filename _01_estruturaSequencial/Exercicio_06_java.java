package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_06_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor dos tres numeros desejados");
        double A;
        double B;
        double C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        double T = (A * C) / 2;
        double c = (C * C) * 3.14159;
        double Tr = ((A + B) * C) / 2;
        double Q = B * B;
        double R = A * B;
        System.out.printf("Area do Triangulo: %.3f%n", T);
        System.out.printf("Area do Circulo: %.3f%n", c);
        System.out.printf("Area do Trapezio: %.3f%n", Tr);
        System.out.printf("Area do Quadrado: %.3f%n", Q);
        System.out.printf("Area do Retangulo: %.3f%n", R);
    }
}




