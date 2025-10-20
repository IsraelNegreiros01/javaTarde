package _17_ExercicioWhile;

import java.util.Scanner;

public class Exercicio_03_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c;

        do {
            System.out.print("Informe o codigo RFIDA: ");
            c = sc.nextLine();
        }while (c.length()!= 8); // O codigo tem que ter 8 caracteres

        System.out.println("Codigo aceito");
    }
}
