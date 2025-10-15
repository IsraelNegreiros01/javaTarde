package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_09_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto de material tem na impressora 3D?");
        double material3D = sc.nextDouble();
        if (material3D > 0) {
            System.out.println("Impressão iniciada");
        } else {
            System.out.println("Sem material disponível");
        }
    }
}
