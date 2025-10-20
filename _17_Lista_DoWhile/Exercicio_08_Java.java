package _17_ExercicioWhile;

import java.util.Scanner;

public class Exercicio_08_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = 50;
        int tc = 0;
        int v = 0;

        do {
            System.out.print("Quantidade de caixas entregues: ");
            int caixas = sc.nextInt();
            tc += caixas;
            v ++;
        } while (tc < m);

        System.out.println("Viagens: " + v + " | Caixas: " + tc);
    }
}
