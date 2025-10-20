package _17_Lista_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex_11_Java {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x;
        System.out.println("programa iniciado");
        x = rand.nextInt(100);
        System.out.println("valor da umidade lida durante o dia:");
        do {
            x = rand.nextInt(100);
            System.out.println(x);
        } while (x < 30 || x > 55);

        System.out.println("umidade aceita: " + x + "%");
    }
}
