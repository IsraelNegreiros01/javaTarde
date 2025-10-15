package Logica_de_Programacao;

import java.util.Random;

public class Exercicio_01_Java {
    public static void main(String[] args) {
        int[] em = new int[100];
        Random r = new Random();

        for (int i = 0; i < em.length; i++) {
            em[i] = r.nextInt(101);
        }

        int soma = 0;
        for (int e : em) {
            soma += e;
        }

        double media = (double) soma / em.length;

        System.out.println("Eficiência das 100 máquinas: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(em[i] + "°C ");
        }

        System.out.println("...");
        System.out.printf("Média de eficiência: %.1f%%\n", media);
    }
}
