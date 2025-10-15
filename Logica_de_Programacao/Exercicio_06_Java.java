package Logica_de_Programacao;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Exercicio_06_Java {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int x, y, z = 0;
        System.out.println("programa iniciado");
        for (x = 1; x <= 30; x++) {
            System.out.println("Quantidade de pecas usadas no dia " + x + ":");
            y = rand.nextInt(500);
            System.out.println(y);
            z = (z + y);
        }
        System.out.println("Estoque medio: " +(z/30));
    }
}