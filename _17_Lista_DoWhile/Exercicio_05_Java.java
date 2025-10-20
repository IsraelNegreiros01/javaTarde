package _17_ExercicioWhile;

import java.util.Scanner;

public class Exercicio_05_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = 500;
        int pt = 0;
        int p = 0;

        do {
            System.out.print("Informe o peso (g) de cada peça do lote: ");
            int pe = sc.nextInt();
            pt += pe;
            p ++;
        } while (pt < l);

        System.out.println("Peças: " + p + " | Peso total: " + pt + " g");
    }
}
