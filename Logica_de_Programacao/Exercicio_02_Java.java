package Logica_de_Programacao;

import java.util.Random;

public class Exercicio_02_Java {
    public static void main(String[] args) {
        int M12 = 12 * 60;
        int[] ts = new int[M12];
        Random r = new Random();

        for (int i = 0; i < ts.length; i++) {
            ts[i] = 350 + r.nextInt(51);
        }

        int soma = 0;
        for (int t : ts) {
            soma += t;
        }

        double media = (double) soma / ts.length;

        System.out.println("Temperaturas registradas (primeiras 10 leituras):");
        for (int i = 0; i < 10; i++) {
            System.out.print(ts[i] + "°C ");
        }

        System.out.println("...");
        System.out.printf("Temperatura média durante 12 horas: %.1f°C\n", media);
    }
}
