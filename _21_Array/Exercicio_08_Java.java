package _21_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_08_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> codigos = new ArrayList<>();

        System.out.println("Digite os códigos separados por espaço:");
        String input = sc.nextLine();

        String[] codigosArray = input.split("\\s+");
        for (String codigo : codigosArray) {
            if (!codigo.trim().isEmpty()) {
                codigos.add(codigo.trim().toUpperCase());
            }
        }

        System.out.println("\nLista de códigos cadastrados:");
        for (String codigo : codigos) {
            System.out.println("- " + codigo);
        }

        String alvo;
        do {
            System.out.print("\nDigite um código para buscar (ou 'SAIR' para encerrar): ");
            alvo = sc.nextLine().trim().toUpperCase();

            if (!alvo.equals("SAIR")) {
                int contador = 0;

                for (String codigo : codigos) {
                    if (codigo.equals(alvo)) {
                        contador++;
                    }
                }

                if (contador > 0) {
                    System.out.println("O código '" + alvo + "' aparece " + contador + " vez(es) na lista.");
                } else {
                    System.out.println("Código '" + alvo + "' não encontrado na lista.");
                }
            }

        } while (!alvo.equals("SAIR"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
