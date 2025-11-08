package _18_Modulação;

import java.util.Scanner;

public class Exercicio_01_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, insira abaixo dois valores por favor");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Agora, me diga qual tipo de fórmula quer, temos: soma, subtração, multiplicação e divisão");
        String opcao = sc.next();
        if (opcao.equalsIgnoreCase("soma")) {
            System.out.println("Ok, resultado da " + " desses dois numeros: " + (x + y));
        } else if (opcao.equalsIgnoreCase("subtração")) {
            System.out.println("Ok, resultado da " + " desses dois numeros: " + (x - y));
        } else if (opcao.equalsIgnoreCase("multiplicação")) {
            System.out.println("Ok, resultado da " + " desses dois numeros: " + (x * y));
        } else if (opcao.equalsIgnoreCase("divisão")) {
            System.out.println("Ok, resultado da " + " desses dois numeros: " + (x / y));
        }
        else {
            System.out.println("Erro, operação inválida, tente novamente mais tarde");
        }
    }
}
