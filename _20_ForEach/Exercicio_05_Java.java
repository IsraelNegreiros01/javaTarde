package _20_ForEach;

import java.util.Scanner;

public class Exercicio_05_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cods = {"A12", "B07", "A12", "C03", "B07", "A12", "D15"};

        String alvo;
        do {
            System.out.print("\nDigite o código para buscar (ou SAIR para encerrar): ");
            alvo = sc.nextLine();

            if (!alvo.equalsIgnoreCase("SAIR")) {
                int cont = 0;
                for (String cod : cods) {
                    if (cod.equalsIgnoreCase(alvo)) {
                        cont++;
                    }
                }
                System.out.println("O código '" + alvo + "' aparece " + cont + " vez(es)");
            }

        } while (!alvo.equalsIgnoreCase("SAIR"));

        System.out.println("Programa encerrado!");
        sc.close();
    }
}
