package _17_Lista_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex_20_Java {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x;
        int y = 1;
        x = rand.nextInt(6);
        System.out.println("quantidade de praleleiras: " + x);
        do {
            System.out.println("prateleira " + y + " validada");
            y = (y + 1);
        } while (y <= x);
        System.out.println("inventario concluido");
    }
}
