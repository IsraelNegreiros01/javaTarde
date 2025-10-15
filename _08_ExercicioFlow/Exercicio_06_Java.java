package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_06_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual foi a produção do turno");
        int producao = sc.nextInt();
        if (producao >= 1000) {
            System.out.println("'Meta atingida.'");
        } else {
            System.out.println("Produção abaixo da meta");
        }
    }
}