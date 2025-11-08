package _21_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_07_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

        System.out.println("Digite palavras separadas por espaço:");
        String input = sc.nextLine();

        String[] palavrasArray = input.split("\\s+");
        for (String palavra : palavrasArray) {
            if (!palavra.trim().isEmpty()) {
                palavras.add(palavra.trim());
            }
        }

        System.out.println("\nLista original:");
        for (String palavra : palavras) {
            System.out.println("- " + palavra);
        }

        System.out.print("\nDigite o tamanho mínimo das palavras: ");
        int tamanhoMinimo = sc.nextInt();

        if (tamanhoMinimo < 0) {
            System.out.println("Tamanho mínimo não pode ser negativo!");
        } else {
            palavras.removeIf(palavra -> palavra.length() < tamanhoMinimo);

            System.out.println("\nLista após remoção:");
            if (palavras.isEmpty()) {
                System.out.println("Nenhuma palavra atende ao critério.");
            } else {
                for (String palavra : palavras) {
                    System.out.println("- " + palavra);
                }
            }
        }

        sc.close();
    }
}
