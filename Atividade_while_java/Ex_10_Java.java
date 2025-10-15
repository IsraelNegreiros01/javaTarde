package Atividade_while_java;

import java.util.Scanner;

public class Ex_10_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Fc = 0;
        int M = 0;
        final int Fm = 5;

        System.out.println("=== Monitoramento de Temperatura ===");
        System.out.println("Digite 'ok' para medição normal ou 'falha' para falha do sensor");

        while (Fc < Fm) {
            M++;
            System.out.print("\nMedição" + M + "; ");
            String status = sc.next().toLowerCase();

            if (status.equals("falha")) {
                Fc++;
                System.out.println("FALHA DETECTADA! Falhas consecutivas: " + Fc);
            } else {
                Fc = 0;
                System.out.println("Sensor ok");
            }
        }
        System.out.println("\n ALERTA CRÍTICO!");
        System.out.println("Sistema será desligado devido a " + Fm + " Falhas consecutivas! ");
        System.out.println("Total de medições realizadas: " + M);

        sc.close();
    }
}
