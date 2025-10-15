package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_04_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira o peso da peca");
        x = sc.nextDouble();
        if (x >= 5){
            System.out.println("peca pesada");
        }
        else {
            System.out.println("peca leve");
        }
    }
}
