package _17A_AuxIfElse;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_24_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, analisando estado do estoque");
        String estoque = Produto ();
        System.out.println(estoque);
        sc.close();
    }
    public static String Produto () {
        Random rand = new Random();
        int x = rand.nextInt(50);
        if ( x > 30) {
            return "Estoque suficiente";
        } else if ( x < 10 ) {
            return "Reeabastecer urgentimente";
        }
        else {
            return "Alerta";
        }
    }
}
