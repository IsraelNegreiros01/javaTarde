package Atividade_while_java;

import java.util.Scanner;

public class Ex_04_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = 500;
        System.out.println("valor do estoque final:");
        while ( x != 80) {
            x = x - 20;
        }
        System.out.println(x + " unidades");
    }
}
