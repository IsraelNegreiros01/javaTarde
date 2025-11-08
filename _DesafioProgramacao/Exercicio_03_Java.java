package _DesafioProgramacao;

import java.util.Scanner;

public class Exercicio_03_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Programa iniciado, digite um número inteiro e uma palavra para eu verificar se são um palindromo ou nao ");
        int x = sc.nextInt();
        String palavra = sc.next();
        int Original = x;
        int Reverse = 0;

        while (x > 0) {
            int ultimo = x % 10;
            Reverse = Reverse * 10 + ultimo;
            x = x / 10;
        }
            if (Original == Reverse) {
                System.out.println("Sim, o numero " + Original + " é um palindromo");
            } else {
                System.out.println("Não, o numero " + Original + " não é um palindromo");
            }
            String OriginalP = palavra;
            String ReverseP = new StringBuilder(OriginalP).reverse().toString();
        if (OriginalP.equals(ReverseP)) {
            System.out.println("E sim, a palavra " + OriginalP + " e um palindromo tambem");
        } else {
            System.out.println("E nao, a palavra " + OriginalP + " nao e um palindromo");
        }


    }
}


