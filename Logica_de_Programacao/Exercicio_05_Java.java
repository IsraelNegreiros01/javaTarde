package Logica_de_Programacao;

import java.util.Random;

public class Exercicio_05_Java {
    public static void main(String[] args) {
        int ip = 10;
        int hs = 24;
        double[][] cm = new double[ip][hs];
        Random r = new Random();

        for (int m = 0; m < ip; m++) {
            for (int h = 0; h < hs; h++) {
                cm[m][h] = 5 + r.nextDouble() * 5;
            }
        }

        double ct = 0;
        for (int m = 0; m < ip; m++) {
            for (int h = 0; h < hs; h++) {
                ct += cm[m][h];
            }
        }

        System.out.println("Consumo das primeiras 3 máquinas nas primeiras 5 horas:");
        for (int m = 0; m < 3; m++) {
            System.out.print("Máquina " + (m + 1) + ": ");
            for (int h = 0; h < 5; h++) {
                System.out.printf("%.1f kWh ", cm[m][h]);
            }
            System.out.println("...");
        }
        System.out.printf("Consumo total em 24 horas: %.1f kWh\n", ct);
    }
}
