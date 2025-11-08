package _18_Modulação;

import java.util.Scanner;

public class Exercicio_02_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, insira uma temperatura");
        int x = sc.nextInt();
        System.out.println("Agora me diga, quer que eu transforme o valor inserido em Fahrenheit ou em Graus Celsius?");
        String opcao = sc.next();
        if (opcao.equalsIgnoreCase("Fahrenheit")) {
            System.out.println("Ok, valor alterado em Fahrenheit, valor atual:" + (x * 1.8 + 32));
        }
        else {
            System.out.println("Ok, valor alterado em Celsius, valor atual:" + ((x - 32) * 5 / 9));
        }
    }
}
