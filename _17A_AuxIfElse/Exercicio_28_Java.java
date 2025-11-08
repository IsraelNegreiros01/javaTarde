package _17A_AuxIfElse;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_28_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, analisando transito");
        String rua = transito ();
        System.out.println(rua);
        sc.close();
    }
    public static String transito ( ) {
        Random rand = new Random();
        int x = rand.nextInt(4);
        if ( x == 1 ) {
            return "Seguir normal";
        } else if ( x == 2 ) {
            return "Fazer uma rota alternativa";
        }
        else {
            return "Recalcular rota";
        }
    }
}
