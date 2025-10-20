package _17_ExercicioWhile;

import java.util.Scanner;

public class Exercicio_10_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c;

        do {
            System.out.print("Ciclos válidos: ");
            int ci = sc.nextInt();
            System.out.print("Paradas: ");
            int p = sc.nextInt();

            double d = (double) ci / (ci + p);
            System.out.printf("Disponibilidade: %.2f\n", d);

            System.out.print("Continuar? (s/n): ");
            c = sc.next();
        } while (c.equalsIgnoreCase("s"));
    }
}
