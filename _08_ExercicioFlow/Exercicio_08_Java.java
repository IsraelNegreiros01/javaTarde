package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_08_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o nível do Óleo?");
        double nivelOleo = sc.nextDouble();
        if (nivelOleo < 30) {
            System.out.println("Adicionar óleo");
        } else {
            System.out.println("Nível adequado");
        }

    }
}