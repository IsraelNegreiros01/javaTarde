package _17_ExercicioWhile;

import java.util.Scanner;

public class Exercicio_02_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = 120;
        int t = 0;
        int c =0;

        do {
            System.out.print("Quantas peças foram produzidas?: ");
            int p = sc.nextInt();
            t += p;
            c ++;
        } while (t < m);

        System.out.println("Ciclos: " + c +"| Total: " +t);
    }
}
