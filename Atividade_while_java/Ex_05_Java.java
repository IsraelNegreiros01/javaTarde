package Atividade_while_java;

import java.util.Scanner;

public class Ex_05_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        System.out.println("tempo total até que a maquina deslige por muita pressao:");
        while ( y < 120) {
            x = x + 1;
            y = y + 1;
        }
        System.out.println(x + " horas");
    }
}
