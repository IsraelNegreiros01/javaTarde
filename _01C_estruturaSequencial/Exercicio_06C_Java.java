package _01C_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_06C_Java {
    public static void main(String[] args) {
            int D, J, R;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi o valor do depósito?");
        D = sc.nextInt();
        System.out.println("Quanto foi a taxa de juros mensais");
        J = sc.nextInt();
        R = D/J;
        System.out.println("O valor do rendimento após um mês é: " + R);
    }
}
