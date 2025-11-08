package _DesafioProgramacao;

import java.util.Scanner;

public class Exercicio_04_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, insira o valor que voce deseja sacar");
        double x = sc.nextDouble();
        System.out.println("Ok, o valor sera retornado em notas de: ");
        System.out.println(ParaDinheiro((int) x));
    }

    public static String ParaDinheiro(int x) {
        int[] notas = {200, 100, 50, 20, 10, 5, 2, 1};
        double[] moedas = {0.5, 0.25, 0.1, 0.05};
        String s = "";
        for (int i = 0; i < notas.length; i++) {
            int q = (int) x/notas[i];
            if ( q > 0 ) s += q + " nota/moeda de " + notas[i] + ", ";
            x %= notas[i];
        }
        for (int i = 0; i<moedas.length; i++){
            int q = (int) (x/moedas[i]);
            if ( q > 0 ) s += q + " moeda de " + (int) (moedas[i] * 100) + " centavos, ";
            x %= moedas[i];
        }
        if ( x > 0.001 ) s += "resto não dá para devolver";
        return s;
    }
}


