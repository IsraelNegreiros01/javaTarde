package _17_Lista_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex_14_Java {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int d1 = 0, d2 = 0, d3 = 0;
        String codigo;
        System.out.println("Iniciando leitura de códigos");
        do {
            int num = rand.nextInt(4);
            if (num == 0) {
                codigo = "D01";
                d1++;
            } else if (num == 1) {
                codigo = "D02";
                d2++;
            } else if (num == 2) {
                codigo = "D03";
                d3++;
            } else {
                codigo = "FIM";
            }

            System.out.println("Código lido: " + codigo);
        } while (!codigo.equals("FIM"));

        System.out.println("D01: " + d1 + " | D02: " + d2 + " | D03: " + d3);
    }
}