package _DesafioProgramacao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_02_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x;
        System.out.println("Programa iniciado");
        x = rand.nextInt(400);
        System.out.println("Numero selecionado: " + x);
        System.out.println("O " + x + " em algarismo romano é: " + paraRomano(x));

    }
    public static String paraRomano(int num) {
        String[] milhares = {"", "C", "CC", "CCC"};
        String[] centenas = {"", "C", "CC", "CCC"};
        String[] dezenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return centenas[num / 100] + dezenas[(num % 100) / 10] + unidades[num % 10];
    }
}


