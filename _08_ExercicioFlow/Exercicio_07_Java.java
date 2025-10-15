package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_07_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos defeitos são no total");
        int defeitos = sc.nextInt();
        if (defeitos > 5) {
            System.out.println("'Lote reprovado");
        } else {
            System.out.println("Lote aprovado");
        }
    }
}