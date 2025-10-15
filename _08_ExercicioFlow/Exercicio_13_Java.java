package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_13_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira a quantidade de energia captada");
        x = sc.nextDouble();
        if (x < 200) {
            System.out.println("acionar energia auxiliar");
        }
        else {
            System.out.println("energia solar suficiente");
        }
    }
}
