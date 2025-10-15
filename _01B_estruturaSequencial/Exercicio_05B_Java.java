package _01B_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_05B_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("insira o valor do seu salario atual");
        x = sc.nextDouble();
        y = ((x/100)*10);
        System.out.println("o valor do seu salario com um aumento de 10 por cento aplicado e: "+(y + x));
    }
}
