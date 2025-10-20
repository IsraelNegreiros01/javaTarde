package _17_Lista_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex_13_Java {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x;
        System.out.println("programa iniciado");
        System.out.println("tempo de mistura do tanque:");
        do {
            x = rand.nextInt(11);
            System.out.println(x);
        } while ( x != 10);
        System.out.println("mistura encerrada aos 10 minutos");
    }
}
