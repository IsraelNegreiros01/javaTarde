package _01B_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_08B_Java {
    public static void main(String[] args) {
        double n1, n2, D, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o primeiro numero");
        n1 = sc.nextInt();
        System.out.println("Qual o segundo numero");
        n2 = sc.nextInt();
        a= n1 % n2;
        System.out.printf("o valor do resto da divisao é:"+a);
    }
}
