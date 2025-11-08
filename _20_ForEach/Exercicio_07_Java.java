package _20_ForEach;

import java.util.Scanner;

public class Exercicio_07_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado");
        int[] v = new int[3];
        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        System.out.println("Exibindo os precos caros dentro do vetor:");
        for ( int obj : v) {
            if (obj > 50) {
                System.out.println(obj);
            }
        }
    }
}
