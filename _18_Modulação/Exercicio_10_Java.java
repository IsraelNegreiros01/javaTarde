package _18_Modulação;

import java.util.Scanner;

public class Exercicio_10_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite (valor moedaOrigem moedaDestino): ");
        String[] dados =sc.nextLine().split("");

        double vl = Double.parseDouble(dados[0]);
        String og = dados[1].toUpperCase();
        String dst = dados[2].toUpperCase();

        double tx = 0;
        if (og.equals("BRL") && dst.equals("USD")) tx = 0.18;
        else if (og.equals("BRL") && dst.equals("EUR")) tx = 0.16;
        else if (og.equals("USD") && dst.equals("BRL")) tx =5.45;
        else if (og.equals("USD") && dst.equals("EUR")) tx = 0.92;
        else if (og.equals("EUR") && dst.equals("BRL")) tx = 5.92;
        else if (og.equals("EUR") && dst.equals("USD")) tx = 1.09;

        double resultado = vl * tx;
        System.out.printf("%.2f %s = %.2f %s\n", vl, og, resultado, dst);

    }
}
