package Atividade_while_java;

import java.util.Scanner;

public class Ex_08_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Pa = 0;
        int Ft = 0;
        int Fq = 10000;
        int Fm = 50;

        System.out.println("=== Controle de qualidadade ===");
        while (Pa < Fq && Ft < Fm) {
            Pa++;
            if (Math.random() < 0.1) {
                Ft++;
            }
            if (Pa % 500 == 0) {
                System.out.println("Peças produzidas " + Pa + "| Falhas" + Ft);
            }
        }
        System.out.println("/nProdução finalizada!");
        System.out.println("Total de peças" + Pa);
        System.out.println("Total de falha" + Ft);

        sc.close();
    }
}
