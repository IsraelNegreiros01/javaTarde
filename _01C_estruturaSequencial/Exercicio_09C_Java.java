package _01C_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_09C_Java {
    public static void main(String[] args) {
        double Bm, Bn, At,C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a maior base do trapézio?");
        Bm = sc.nextDouble();
        System.out.println("Qual é a menor base do trapézio?");
        Bn = sc.nextDouble();
        System.out.println("Qual a altura do trapézio?");
        At = sc.nextDouble();
        C = (Bm + Bn) * At/2;
        System.out.println("A área tem: "+ C);
    }
}
