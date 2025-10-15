package Atividade_while_java;

import java.util.Scanner;

public class Ex_03_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y;
        y = 1;
        System.out.println("total de unidades produzidas em 8 horas:");
        while ( y <= 8) {
            y = y + 1;
            x += 50;
        }
        System.out.println(x + " unidades");
    }
}
