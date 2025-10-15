package Atividade_while_java;

import java.util.Scanner;

public class Ex_01_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        x = 1;
        System.out.println("essas foram todas as pecas produzidas");
        while ( x <= 100) {
            System.out.println("peca " + x);
            x = x + 1;
        }
    }
}
