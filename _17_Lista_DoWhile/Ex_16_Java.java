package _17_Lista_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex_16_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            int aprovados = 0, reprovados = 0;
            int i = 0;
            char resultado;

            System.out.println("Iniciando controle de qualidade...\n");

            do {
                int num = rand.nextInt(4);

                if (num == 0) {
                    resultado = 'A';
                    aprovados++;
                    i++;
                    System.out.println("Amostra " + i + ": Aprovada");
                } else if (num == 1) {
                    resultado = 'R';
                    reprovados++;
                    i++;
                    System.out.println("Amostra " + i + ": Reprovada");
                } else {
                    resultado = 'X';
                    System.out.println("Leitura inválida. Tentando novamente...");
                }

            } while (i < 10);

            System.out.println("\nTotal de amostras válidas: " + i);
            System.out.println("A: " + aprovados + " | R: " + reprovados);
        }
    }

