package _17A_AuxIfElse;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_26_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, conferindo a quantidade de tinta restante");
        String tinta = Quantidade ();
        System.out.println(tinta);
        sc.close();
    }
    public static String Quantidade () {
        Random rand = new Random();
        int x = rand.nextInt(100);
        if ( x < 15 ) {
            return "Parar robo de pintura imediatamente";
        } else if ( x > 50 ) {
            return "Continuar pintura, quantidade de tinta suficiente";
        }
        else {
            return "Alerta, energia se esgotando";
        }
    }
}
