package _17_Lista_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex_17_Java {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        double x;
        int y = 0;
        System.out.println("programa iniciado");
        do {
            x = rand.nextInt((int) 5.5);
            System.out.println(x);
            y = (y + 1);
        } while (x < 2.5);
        System.out.println("leituras totais: " + y);
    }
}
