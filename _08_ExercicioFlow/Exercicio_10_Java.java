package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_10_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto pesa cada caixa (Kg)");
        double pesoCaixas = sc.nextDouble();
        if (pesoCaixas > 500) {
            System.out.println("Capacidade excedida");
        } else {
            System.out.println("Peso dentro do limite.");
        }

    }
}
