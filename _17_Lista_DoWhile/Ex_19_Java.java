package _17_Lista_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex_19_Java {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x, y, z, b = 0;
        int a = 1;
        System.out.println("iniciando ciclo de pecas:");
        do {
            x = rand.nextInt(101);
            y = rand.nextInt(101);
            System.out.println("ciclo " + a + ": " + x + " pecas, " + y + " falhas");
            a = (a + 1);
            z = ( x/y );
            System.out.println("taxa de falha: " + z);
            if (z <= 2) {
                b += z;
            }
            else {
                System.out.println("taxa final: " + b + "%");
            }
        } while (z <= 2);
    }
}
