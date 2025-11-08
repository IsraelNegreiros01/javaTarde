package _17A_AuxIfElse;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_30_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, analisando temperatura");
        String temperatura = graus ();
        System.out.println(temperatura);
        sc.close();
    }
    public static String graus () {
        Random rand = new Random();
        int x = rand.nextInt(100);
        if ( x > 80) {
            return "Desligar servidores";
        } else if ( x < 60) {
            return "Resfriamento normal";
        }
        else {
            return "Resfriamento extra";
        }
    }
}
