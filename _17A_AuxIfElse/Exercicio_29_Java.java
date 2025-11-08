package _17A_AuxIfElse;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_29_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, realizando a inspeção");
        String situacao = inspecao();
        System.out.println(situacao);
        sc.close();
    }

    public static String inspecao() {
        Random rand = new Random();
        int x = rand.nextInt(50);
        if (x > 20) {
            return "Reprovar";
        } else if (x < 10) {
            return "Aprovar";
        } else {
            return "Retrabalho";
        }
    }
}
