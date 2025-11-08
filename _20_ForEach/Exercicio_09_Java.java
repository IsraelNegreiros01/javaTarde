package _20_ForEach;

import java.util.Scanner;

public class Exercicio_09_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado");
        System.out.print("Digite os emails separados por virgula:");
        String emails = sc.nextLine();
        String[] Emails = emails.split(", ");
        System.out.println("Exibindo os emails dentro do vetor com letras minusculas:");
        for (String obj : Emails) {
            obj = obj.trim().toLowerCase();
            System.out.println(obj);
        }
        String[] originais = new String[Emails.length];
        int Unicos = 0;
        for (String x : Emails) {
            x = x.trim().toLowerCase();

            boolean jaExiste = false;
            for (int i = 0; i < Unicos; i++) {
                if (originais[i].equals(x)) {
                    jaExiste = true;
                    break;
                }
            }
            if (!jaExiste) {
                originais[Unicos] = x;
                Unicos++;
            }
        }
        System.out.println("Emails únicos:");
        for (int i = 0; i < Unicos; i++) {
            System.out.println(originais[i]);
        }
    }
}
