package _01B_estruturaSequencial;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03B_Java {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("insira o valor do raio do circulo");
        x = sc.nextDouble();
        y = ((Math.pow(x,2)) * 3.14);
        System.out.printf("valor da area do circulo: %.3f%n", y);
    }
}
