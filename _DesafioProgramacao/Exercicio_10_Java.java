package Desafios_de_Programação;

import java.util.Scanner;

public class Exercicio_10_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ns = (int) (Math.random() * 100) + 1;
        int t = 0;
        int mt = 7;
        boolean acertou = false;

        System.out.println("Adivinhe o número entre 1 e 100!");

        int min = 1, max = 100;
        int melhorPalpite = 0;

        while (!acertou && t < 10) {
            System.out.print("Tentativa " + (t + 1) + ": ");
            int palpite = sc.nextInt();
            t++;

            if (palpite == ns) {
                acertou = true;
                System.out.println("Parabéns! Você acertou em " + t + " tentativas!");
            } else if (palpite < ns) {
                System.out.println("É MAIOR!");
                min = palpite + 1;
            } else {
                System.out.println("É MENOR!");
                max = palpite - 1;
            }
        }

        if (!acertou) {
            System.out.println("Game Over! O número era: " + ns);
            return;
        }

        System.out.println("\n--- ANÁLISE DE EFICIÊNCIA ---");
        System.out.println("Número secreto: " + ns);
        System.out.println("Sua tentativas: " + t);
        System.out.println("Busca binária teórica: " + mt + " tentativas");

        if (t <= mt) {
            System.out.println("Excelente! Sua estratégia foi eficiente!");
        } else {
            System.out.println("Dica: Tente sempre o meio do intervalo atual para ser mais eficiente!");
        }
    }
}
