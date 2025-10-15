package flowgorithmIntellij;

import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o número de itens detectados: ");
                int itens = scanner.nextInt();

                if (itens < 10) {
                    System.out.println("Velocidade: LENTA");
                } else if (itens >= 10 && itens <= 30) {
                    System.out.println("Velocidade: MÉDIA");
                } else if (itens > 30) {
                    System.out.println("Velocidade: RÁPIDA");
                }

                scanner.close();
    }
}
