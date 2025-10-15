package Logica_de_Programacao;

import java.util.Random;

public class Exercicio_03_Java {
    public static void main(String[] args) {
        int d = 30;
        int[] pd = new int[d];
        Random r = new Random();

        for (int i = 0; i < pd.length; i++) {
            pd[i] = 450 + r.nextInt(151);
        }

        int pt = 0;
        for (int producao : pd) {
            pt += producao;
        }

        double md = (double) pt / d;

        System.out.println("Produção diária (primeiros 10 dias):");
        for (int i = 0; i < 10; i++) {
            System.out.print(pd[i] + " ");
        }

        System.out.println("...");
        System.out.println("Produção total do mês: " + pt);
        System.out.printf("Média diária: %.1f\n", md);
    }
}
