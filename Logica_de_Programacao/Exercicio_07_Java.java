package Logica_de_Programacao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_07_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x, y, z = 0;
        System.out.println("Programa iniciado");
        System.out.println("tempo gasto de soldagem em 24 horas :");
        for (x = 1; x <= 24; x++){
            y = rand.nextInt(60);
            z = (z + y);
            System.out.println(y + " minutos");
        }
        System.out.println("tempo medio gasto de soldagem: " + (z/24) + " minutos");
    }
}
