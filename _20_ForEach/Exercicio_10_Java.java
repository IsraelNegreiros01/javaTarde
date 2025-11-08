package _20_ForEach;

import java.util.Scanner;

public class Exercicio_10_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("Programa iniciado");
        int[] v = new int[6];
        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite a pontuacao do jogador numero " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        System.out.println("Exibindo as pontuacoes dos jogadores dentro do vetor:");
        System.out.println("Notas excelentes: ");
        for ( int obj : v) {
            if ( obj > 50 && obj <= 100 ) {
                System.out.println(obj);
                x = x + 1;
            } else if ( obj > 100 ) {
                System.out.println(obj);
                x = x + 1;
            }
        }
        System.out.println("Total de pontuacoes boas: " + x);
        System.out.println("Notas baixas, necessita treinamento: ");
        for ( int obj : v) {
            if ( obj < 50 ) {
                System.out.println(obj);
                y = y + 1;
            }
        }
        System.out.println("Total de pontuacoes ruins: " + y);
    }
}
