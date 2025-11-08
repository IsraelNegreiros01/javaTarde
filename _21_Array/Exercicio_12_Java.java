package _21_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_12_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fila = new ArrayList<>();

        System.out.println("Digite os nomes da fila separados por espaço:");
        String input = sc.nextLine();

        String[] nomesArray = input.split("\\s+");
        for (String nome : nomesArray) {
            if (!nome.trim().isEmpty()) {
                fila.add(nome.trim());
            }
        }

        System.out.println("\nFila inicial:");
        for (int i = 0; i < fila.size(); i++) {
            System.out.println((i + 1) + ". " + fila.get(i));
        }

        System.out.print("\nDigite o número de rotações (k): ");
        int k = sc.nextInt();

        if (k < 0) {
            System.out.println("Número de rotações não pode ser negativo!");
        } else if (fila.isEmpty()) {
            System.out.println("Fila vazia! Nada para rotacionar.");
        } else {
            for (int i = 0; i < k; i++) {
                String primeiro = fila.remove(0);  // Remove o primeiro
                fila.add(primeiro);               // Adiciona no final
            }

            System.out.println("\nFila após " + k + " rotação(ões):");
            for (int i = 0; i < fila.size(); i++) {
                System.out.println((i + 1) + ". " + fila.get(i));
            }
        }

        sc.close();
    }
}
