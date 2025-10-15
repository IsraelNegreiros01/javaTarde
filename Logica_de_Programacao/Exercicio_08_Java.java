package Logica_de_Programacao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_08_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x, y, z = 0;
        System.out.println("Tempo de operacao das maquinas em 12 periodos:");
        for ( x = 1; x <= 12; x++) {
            y = rand.nextInt(360);
            System.out.println(y);
            z = z + y;
        }
        System.out.println("tempo total de operacao das maquinas: " + z);

    }
}
