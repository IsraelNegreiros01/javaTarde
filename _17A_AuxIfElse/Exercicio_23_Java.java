package _17A_AuxIfElse;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_23_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, analisando segurança da rede");
        String rede = Segurança ();
        System.out.println(rede);
        sc.close();
    }
    public static String Segurança () {
        Random rand = new Random();
        int x = rand.nextInt(101);
        if ( x < 30 ) {
            return "Rede normal";
        } else if ( x > 70 ) {
return "Fechar trafego na rede";
        }
        else {
            return "Alerta";
        }

    }
}
