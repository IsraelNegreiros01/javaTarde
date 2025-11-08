package _20_ForEach;

import java.util.Scanner;

public class Exercicio_12_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado");
        System.out.println("Escolha uma opcao: (1-Cadastrar nomes, 2-Listar nomes, 3-Listar nomes que começam com uma letra, 0-Sair");
        int escolha = sc.nextInt();
        String[] v = null;
        do {
            if (escolha == 1) {
                System.out.println("Ok");
                v = new String[10];
                for (int i = 0; i < v.length; i++) {
                    System.out.print("Digite o nome numero " + (i + 1) + ": ");
                    v[i] = sc.next();
                }
                System.out.println("OK, todos os nomes foram cadastrados");
            } else if (escolha == 2) {
                System.out.println("Exibindo as palavras cadastradas");
                for (String indice : v) {
                    System.out.println(indice);
                }
            } else if (escolha == 3) {
                System.out.println("Digite a letra");
                String letra= sc.nextLine();

                for (String indice:v) {
                    String[] letras= indice.split("");
                    if (letras[0].equalsIgnoreCase(letra)) {
                        System.out.println(indice);
                    }
                }
            }else {
                System.out.println("Ok, aproveite seu dia");
            }

        }while (escolha != 0);
    }
}
