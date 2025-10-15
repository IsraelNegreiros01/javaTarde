package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_15_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira em porcentagem a quantidade de pecas aprovadas");
        x = sc.nextDouble();
        if ( x <90) {
            System.out.println("qualidade abaixo do aceitavel");
        }
        else {
            System.out.println("qualidade aceitavel");
        }
    }
}
