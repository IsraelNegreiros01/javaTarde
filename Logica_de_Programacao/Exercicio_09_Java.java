package Logica_de_Programacao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_09_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x, y, z = 0;
        System.out.println("Previsao de demanda dos 10 produtos em 12 meses: ");
        for (x = 1; x <= 12; x++) {
            y = rand.nextInt(3000);
            System.out.println(y);
            z = z + y;
        }
        System.out.println("previsao media: " + (z/12));
    }
}
