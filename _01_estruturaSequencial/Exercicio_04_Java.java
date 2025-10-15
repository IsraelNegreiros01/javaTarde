package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_04_Java {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a, b, c;
    System.out.println("Quantas horas o funcionario trabalhou");
    a = sc.nextDouble();
    System.out.println("Quanto o funcionario recebe por hora");
    b = sc.nextDouble();
    System.out.println("Quantos dias o funcionario trabalhou");
    c = sc.nextDouble();
    System.out.printf("NUMBER" + c);;
    System.out.println();
    double som = b * a;
    System.out.printf("salary US " + som);
    }
}
