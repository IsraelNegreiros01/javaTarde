package _21_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_02_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String input;

        System.out.println("Digite os nomes(quanto quiser parar digite FIM):");
        do {
            input = sc.nextLine();
            String nomePadrao = input.trim().toLowerCase();
            if (!nomePadrao.equals("FIM")) {
                boolean existe = false;
                for (String nome : nomes) {
                    if (nome.trim().toLowerCase().equals(nomePadrao)) {
                        existe = true;
                        break;
                    }
                }
                if (!existe) {
                    nomes.add(input);
                    System.out.println("Nome adicionado.");
                } else {
                    System.out.println("Nome já existe na lista.");
                }
            }
        } while (!input.trim().equalsIgnoreCase("FIM"));
        System.out.println("Lista de nomes cadastrados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}




