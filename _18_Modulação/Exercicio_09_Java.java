package _18_Modulação;

import java.util.Scanner;

public class Exercicio_09_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade: ");

        int I = sc.nextInt();

        if (I <= 12) System.out.println("Infantil");
        else if (I <= 17) System.out.println("Adolescente");
        else if (I <= 59) System.out.println("Adulto");
        else System.out.println("Idoso");
    }
}
