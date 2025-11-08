package _17A_AuxIfElse;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_25_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, analisando a intensidade eletrica");
        String energia = Intensidade ();
        System.out.println(energia);
        sc.close();
    }
    public static String Intensidade () {
        Random rand = new Random();
        int x = rand.nextInt(250);
        if ( x < 100 ) {
            return "Intensidade baixa";
        } else if ( x > 200 ) {
            return "Intensidade forte";
        }
        else {
            return "Intensidade média";
        }
    }
}
