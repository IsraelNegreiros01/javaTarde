package _DesafioProgramacao;

import java.util.Scanner;

public class Exercicio_08_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        System.out.println(sc.nextInt() + " em binário: " + decimalParaBinario(sc.nextInt()));

        sc.nextLine();

        System.out.print("Digite um número binário: ");
        String binario = sc.nextLine();
        System.out.println(binario + " em decimal: " + binarioParaDecimal(binario));

        sc.close();
    }

    public static String decimalParaBinario(int n) {
        return n == 0 ? "0" : Integer.toBinaryString(n);
    }

    public static int binarioParaDecimal(String bin) {
        return Integer.parseInt(bin, 2);
    }
}
