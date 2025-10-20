package _17_ExercicioWhile;

import java.util.Scanner;

public class Exercicio_06_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ap = 0, re = 0;
        String r;

        do {
            System.out.print("Resultados de inspeção visual ('A' = aprovada, 'R' = reprovada): ");
            r = sc.nextLine().toUpperCase();

            if (r.equals("A")) {
                ap ++;
            } else if (r.equals("R")) {
                re ++;
            }
        } while (!r.equals("FIM"));

        System.out.println("Aprovadas: " + ap + " | Reprovadas: " + re);
    }
}
