package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_12_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a eficiência da produção");
        double eficiencia = sc.nextDouble();
        if (eficiencia >= 85) {
            System.out.println("Eficiência aceitável");
        } else {
            System.out.println("Manutenção recomendada");
        }

        sc.close();
    }
}
