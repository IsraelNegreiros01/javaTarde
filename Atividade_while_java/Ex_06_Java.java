package Atividade_while_java;

import java.util.Scanner;

public class Ex_06_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Pp = 0;
        int Tp = 60;
        int Tt = 0;
        System.out.println("=== Tempo de produção ===");

        while (Pp <10) {
            Tt += Tp;
            System.out.println("Peças "+(Pp + 1) + "produzida em " + Tp + "segundos");
            Tp -= 10;
            Pp ++;
        }
        System.out.println("/nTempo total para produzir 10 peças " + Tt + "segundos");

        sc.close();
    }
}
