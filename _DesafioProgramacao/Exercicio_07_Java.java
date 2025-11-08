package _DesafioProgramacao;

import java.util.Scanner;

public class Exercicio_07_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        int num1 = Math.abs(a);
        int num2 = Math.abs(b);

        while (num2 != 0) {
            int resto = num1 % num2;
            num1 = num2;
            num2 = resto;
        }

        System.out.println("O Máximo Divisor Comum (MDC) de " +
                a + " e " + b + " é: " + num1);

        sc.close();
    }
}
