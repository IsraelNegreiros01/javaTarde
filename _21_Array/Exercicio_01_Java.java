package _21_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_01_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        System.out.println("Digite suas tarefas separadas por virgula:");
        String input = sc.nextLine();
        String[] palavrasArray = input.split(", ");
        System.out.println("Exibindo sua lista de tarefas:");
        for (String palavra : palavrasArray) {
            if (!palavra.trim().isEmpty()) {
                tarefas.add(palavra.trim());
                System.out.println(palavra);
            }
        }
    }
}
