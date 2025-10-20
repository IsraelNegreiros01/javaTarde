package _17_ExercicioWhile;

import java.util.Scanner;

public class Exercicio_09_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean ta;
        int tt = 0;

        do {
            System.out.print("Resultado do teste (true/false): ");
            ta = sc.nextBoolean();
            tt++;
        } while (!ta);

        System.out.println("Tentativas: " + tt);
    }
}
