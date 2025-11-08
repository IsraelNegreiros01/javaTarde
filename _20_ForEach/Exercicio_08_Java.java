package _20_ForEach;

import java.util.Scanner;

public class Exercicio_08_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado");
        int[] v = new int[7];
        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        System.out.println("Exibindo os valores de temperatura dentro do vetor:");
        for ( int obj : v) {
            if ( obj >= 35 ) {
                System.out.println("Alerta, temperatura alta " + obj);
            }
            else {
                System.out.println(obj + " temperatura normal");
            }
        }
    }
}
