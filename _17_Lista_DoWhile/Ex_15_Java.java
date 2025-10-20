package _17_Lista_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex_15_Java {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x;
        System.out.println("programa iniciado, valor calibrado");
        do {
            x = rand.nextInt(30);
            System.out.println(x);
        } while (x < 4 && x <= 20);
        System.out.println("calibracao ok: " + x);
    }
}
