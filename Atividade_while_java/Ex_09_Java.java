package Atividade_while_java;

import java.util.Scanner;

public class Ex_09_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = 0;
        double Cp = 100.0;
        double Ct = 0.0;

        System.out.println("=== Monitoramento de Energia ===");

        while (H < 5) {
            H++;
            Ct += Cp;
            System.out.printf("Horas %d: %.2f watts | Total: %.2f watts\n", H, Cp, Ct);
            Cp *= 1.10;
        }
        System.out.printf("\nConsumo total após 5 horas: %.2f watts\n", Ct);

        sc.close();
    }
}
