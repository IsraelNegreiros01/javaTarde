package Desafios_de_Programação;

import java.util.Scanner;

public class Exercicio_09_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para fatorar: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("O número deve ser maior que 1");
            return;
        }

        System.out.print("Fatores primos de " + n + ": ");

        int t = n;
        int d = 2;
        boolean pf = true;

        while (t > 1) {
            int c = 0;

            while (t % d == 0) {
                c++;
                t /= d;
            }

            if (c > 0) {
                if (!pf) {
                    System.out.print(" × ");
                }
                System.out.print(d);
                if (c > 1) {
                    System.out.print("^" + c);
                }
                pf = false;
            }
            d++;
        }
        System.out.println();
    }
}
