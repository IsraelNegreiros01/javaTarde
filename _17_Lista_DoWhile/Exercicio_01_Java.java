package _17_ExercicioWhile;

import java.util.Scanner;

public class Exercicio_01_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;
        do {

            System.out.print("Registre leituras de temperatura até que a leitura válida em (ºC): ");
            t = sc.nextInt();
        }while (t < 800 || t > 1200);

        System.out.println("Temperatura valida " + t);
    }
}
