package _21_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_11_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> temperaturas = new ArrayList<>();

        System.out.println("Digite as temperaturas dos últimos 7 dias:");

        for (int i = 1; i <= 7; i++) {
            System.out.print("Dia " + i + ": ");
            double temp = sc.nextDouble();
            temperaturas.add(temp);
        }

        System.out.println("\n=== RELATÓRIO DE TEMPERATURAS ===");

        boolean alertaEmitido = false;
        for (double temp : temperaturas) {
            System.out.printf("Temperatura: %.1f°C", temp);

            if (temp >= 35) {
                System.out.print(" ALERTA DE CALOR!");
                alertaEmitido = true;
            }
            System.out.println();
        }

        if (alertaEmitido) {
            System.out.println("\nATENÇÃO: Foram detectadas temperaturas perigosas!");
        } else {
            System.out.println("\n Todas as temperaturas estão dentro da faixa segura.");
        }

        sc.close();
    }
}
