package _01B_estruturaSequencial;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_09B_Java {
    public static void main(String[] args) {
        int I, meses, M;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a idade da pessoa");
        I = sc.nextInt();
        M = I*12;
        System.out.println("Os meses da pessoa é: "+ M);
    }
}
