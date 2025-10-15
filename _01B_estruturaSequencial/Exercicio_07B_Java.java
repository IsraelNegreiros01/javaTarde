package _01B_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_07B_Java {
    public static void main(String[] args) {
        int horas, dias;
        Scanner sc=new Scanner(System.in);
        System.out.println("Quantos dias se passaram?");
        dias = sc.nextInt();
        horas = dias * 24;
        System.out.println("A quantidade de horas são: "+ horas);
    }
}