package Logica_de_Programacao;

import java.util.Random;

public class Exercicio_04_Java {
    public static void main(String[] args) {
        int pp = 200;
        int[] pd =  new int[pp];
        Random r = new Random();

        int td = 0;
        for (int i = 0; i < pd.length; i++) {
            if (r.nextInt(100) < 4) {
                pd[i] = 1;
                td++;
            } else {

                pd[i] = 0;
            }

        }

        double pds = (double) td / pp * 100;

        System.out.println("Status das primeiras 20 peças (0 = boa, 1 = defeituosa):");
        for (int i = 0; i < 20; i++) {
            System.out.print(pd[i] + " ");
        }

        System.out.println("...");
        System.out.println("Total de peças defeituosas: " + td);
        System.out.printf("Porcentagem de peças defeituosas: %.1f%%\n", pds);
    }
}
