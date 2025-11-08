package _20_ForEach;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class Exercicio_11_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado");
        System.out.print("Digite os produtos e sua respectivas categorias, as categorias de produtos que temos são: Alimento; Objeto; Combustivel e Bebida, ex: arroz: Alimento, ...");
        String produtos = sc.nextLine();
        String[] categoria = produtos.split(", ");
        System.out.println("De qual categoria voce quer que eu exiba os produtos?");
        String opcao = sc.next();
        System.out.println("Ok, exibindo produtos dessa categoria");
        for (String obj : categoria) {
            String[] produto = obj.split(": ");
            if (produto.length == 2 && produto[1].equalsIgnoreCase(opcao)) {
                System.out.println(produto[0]);
            }
        }
    }
}



