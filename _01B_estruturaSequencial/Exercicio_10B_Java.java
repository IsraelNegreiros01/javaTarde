package _01B_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_10B_Java {
    public static void main(String[] args) {
        float Rn1, Rn2, Rn3, S;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o primeiro numero");
        Rn1 = sc.nextFloat();
        System.out.println("Escreva o segundo numero");
        Rn2 = sc.nextFloat();
        System.out.println("Escreva o terceiro numero");
        Rn3 = sc.nextFloat();
        S = (Rn1 + Rn2 + Rn3)/3;
        System.out.printf("A média aritmética é: " + S);
    }
}
