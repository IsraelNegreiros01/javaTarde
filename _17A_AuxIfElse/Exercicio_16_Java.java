package _17A_AuxIfElse;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_16_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, irei ver como estao os defeitos da sua peca");
        String estado = TesteDefeito ();
        System.out.println("estado da peca: " + estado);
        sc.close();
    }

    public static String TesteDefeito(){
        Random rand = new Random();
        int x = rand.nextInt(4);
        if (x == 1) {
            return "defeitos visiveis, descartar";
        } else if (x == 2) {
            return "defeitos microscopicos, porem contem defeitos";
        } else if (x == 3) {
            return "defeitos ausentes, perfeita para comercio";
        }
        else {
            return "erro, não foi possivel analisar, tente novamente mais tarde";
        }
    }
}
