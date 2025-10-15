package _01B_estruturaSequencial;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_06B_Java {
    public static void main(String[] args) {
        int C, F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos graus está fazendo?");
        C= sc.nextInt();
        F= (C*9/5)+32;
        System.out.println("Quantos Fahrenheit está fazendo? "+ F);

    }
}