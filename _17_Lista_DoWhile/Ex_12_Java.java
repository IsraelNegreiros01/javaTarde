package _17_Lista_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex_12_Java {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x;
      int y = 0;
        System.out.println("programa iniciado");
do {
    x = rand.nextInt(31) - 10;
    System.out.println(x);
    if (x >= 0) {
      y =  (y + 1);
    } else {
        System.out.println("paletes, conferidos: " + y);
    }
}while (x >= 0);
    }
}
