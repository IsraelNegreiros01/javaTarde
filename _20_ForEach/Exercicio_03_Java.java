package _20_ForEach;

import java.util.Scanner;

public class Exercicio_03_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos preços deseja informar? ");
        int n = sc.nextInt();

        double[] pcs = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o preço " + (i + 1) + ": ");
            pcs[i] = sc.nextDouble();
        }

        double soma = 0;
        System.out.println("\nPreços informados:");
        for (double pc : pcs) {
            System.out.println("R$ " + pc);
            soma += pc;
        }

        double media = soma / n;
        System.out.println("\nMédia: R$ " + media);

        sc.close();
    }
}
