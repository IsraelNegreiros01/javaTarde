package _21_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_03_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<Integer>();
        int soma = 0, media = 0;
        System.out.println("Digite os valores:");
        while (true) {
            double valor = sc.nextDouble();
            if (valor == 0) {
                break;
            }

            valores.add((int) valor);
            soma += valor;
        }
        System.out.println("exibindo todos os gastos");
        for (Integer Valor : valores) {
            System.out.println(Valor);
            media += Valor;
        }
        System.out.println("exibindo o resultado da soma e media de todos os valores:");
        System.out.println("soma: "+soma);
        System.out.println("media: "+media/ valores.size());

    }
}
