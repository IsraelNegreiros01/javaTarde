package _21_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_04_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

        System.out.println("Digite palavras separadas por espaço:");
        String input = sc.nextLine();

        String[] palavrasArray = input.split("\\s+");
        for (String palavra : palavrasArray) {
            if (palavra.length() <= 4) {
                palavras.add(palavra);
            }
        }
        System.out.println("imprimindo as palavras com até 4 letras:");
        for (String curta : palavras) {
            System.out.println(curta);
        }
    }
}
