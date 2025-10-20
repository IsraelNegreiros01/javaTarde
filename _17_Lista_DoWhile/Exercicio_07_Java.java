package _17_ExercicioWhile;

import java.util.Scanner;

public class Exercicio_07_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double t = 0;
        int tu = 0;
        double c;

        do {
            System.out.print("Consumo (kWh) por turno de uma linha: ");
            c = sc.nextDouble();

            if (c > 0) {
                t += c;
                tu ++;
            }
        } while (c != 0);

        double media = tu > 0 ? t / tu : 0;
        System.out.println("Total: " + t + " | Média: " + media);
    }
}
