package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_11_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Operador detectado na linha? (s/n): ");
        String operadorDetectado = sc.next();
        if (operadorDetectado.equalsIgnoreCase("s")) {
            System.out.println("Pausar linha de produção.");
        } else {
            System.out.println("Linha operando normalmente.");
        }

    }
}