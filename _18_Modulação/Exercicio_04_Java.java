package _18_Modulação;

import java.util.Scanner;

public class Exercicio_04_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, insira um numero");
        int x = sc.nextInt();
        int a = x;
        long fat = 1;

        while (x > 1) {
            fat *= x;
            x--;
        }

        System.out.println("Fatorial de " + a + ": " + fat);
    }
}
