package _21_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_10_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> emails = new ArrayList<>();

        System.out.println("Digite os e-mails separados por vírgula:");
        String input = sc.nextLine();

        String[] emailsArray = input.split(",");

        for (String email : emailsArray) {
            String emailNormalizado = email.trim().toLowerCase();

            if (!emailNormalizado.isEmpty() && !emails.contains(emailNormalizado)) {
                emails.add(emailNormalizado);
            }
        }

        System.out.println("\nLista de e-mails únicos e normalizados:");
        if (emails.isEmpty()) {
            System.out.println("Nenhum e-mail válido encontrado.");
        } else {
            for (String email : emails) {
                System.out.println("- " + email);
            }
            System.out.println("Total: " + emails.size() + " e-mail(s) único(s)");
        }

        sc.close();
    }
}
