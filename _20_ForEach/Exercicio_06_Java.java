package _20_ForEach;

import java.util.Scanner;

public class Exercicio_06_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] pls = frase.split("\\s+");

        System.out.println("Palavras limpas:");
        for (String pl : pls) {
            String palavraLimpa = pl.replaceAll("[.,;!?]", "");
            System.out.println(palavraLimpa);
        }

        sc.close();
    }
}
