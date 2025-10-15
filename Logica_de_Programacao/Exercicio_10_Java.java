package Logica_de_Programacao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_10_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x, y, z = 0;
        System.out.println("resultado de cada um dos 100 testes de qualidade em porcentagem: ");
        for ( x = 1; x <= 100; x++) {
            y = rand.nextInt(100);
            System.out.println(y + "%");
            z = z + y;
        }
        System.out.println("total aprovado em porcentagem: " + ( z/100) + "%");
    }
}
