package _DesafioProgramacao;

import java.util.Scanner;

public class Exercicio_05_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, insira o tamanho da piramide");
        int x = sc.nextInt();
        System.out.println("Ok, piramide criada");

        for (int y = 1; y <= x; y++) {

            for (int z = 1; z <= x - y; z++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= y; z++) {
                System.out.print(y);
            }
            System.out.println();
        }

    }
}
