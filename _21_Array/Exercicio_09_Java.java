package _21_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_09_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> precos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n MENU DE PRODUTOS ");
            System.out.println("1 - Adicionar preço");
            System.out.println("2 - Listar todos os preços");
            System.out.println("3 - Listar preços acima de X");
            System.out.println("4 - Limpar lista");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o preço: R$ ");
                    double preco = sc.nextDouble();
                    if (preco > 0) {
                        precos.add(preco);
                        System.out.println("Preço adicionado com sucesso!");
                    } else {
                        System.out.println("Preço deve ser maior que zero!");
                    }
                    break;

                case 2:
                    System.out.println("\nLista de preços:");
                    if (precos.isEmpty()) {
                        System.out.println("Nenhum preço cadastrado.");
                    } else {
                        for (double p : precos) {
                            System.out.printf("R$ %.2f\n", p);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o preço mínimo: R$ ");
                    double precoMinimo = sc.nextDouble();

                    System.out.println("\nPreços acima de R$ " + precoMinimo + ":");
                    boolean encontrou = false;
                    for (double p : precos) {
                        if (p > precoMinimo) {
                            System.out.printf("R$ %.2f\n", p);
                            encontrou = true;
                        }
                    }
                    if (!encontrou) {
                        System.out.println("Nenhum preço acima do valor informado.");
                    }
                    break;

                case 4:
                    precos.clear();
                    System.out.println("Lista limpa com sucesso!");
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
