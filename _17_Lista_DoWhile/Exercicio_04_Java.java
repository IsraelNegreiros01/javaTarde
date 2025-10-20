package _17_ExercicioWhile;

import java.util.Scanner;

public class Exercicio_04_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int o;

        do {
            System.out.println("1. Registrar parada: ");
            System.out.println("2. Registrar produção: ");
            System.out.println("3. sair: ");
            System.out.print("Escolha: ");
            o = sc.nextInt();

            switch (o) {
                case 1:
                    System.out.println("Parada registrada ");
                    break;
                case 2:
                    System.out.println("Producao registrada ");
                    break;
                case 3:
                    System.out.println("Encerrando menu ");
                    break;
                default:
                    System.out.println("Opcao invalida ");
            }
        }while (o != 3);

    }
}
