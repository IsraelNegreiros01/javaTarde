package Atividade_while_java;

import java.util.Scanner;

public class Ex_07_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Va = 0;
        int M = 0;
        int Vm = 1000;
        System.out.println("=== Controle de velocidade ===");
        while (Va < Vm) {
            M += 2;
            Va += 100;

            if (Va > Vm) {
                Va = Vm;
            }
            System.out.println("Após" + M + "Minutos" + Va + "RPM");
        }
        System.out.println("/nVelocidade máxima atingida" + Vm + "RPM");

        sc.close();
    }
}
