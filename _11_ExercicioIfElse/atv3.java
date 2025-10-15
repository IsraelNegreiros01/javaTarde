package flowgorithmIntellij;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nível de energia (%): ");
                double energia = sc.nextDouble();

                if (energia < 30) {
                    System.out.println("Modo ECONÔMICO ativado");
                } else if (energia >= 30 && energia <= 70) {
                    System.out.println("Modo NORMAL ativado");
                } else if (energia > 70) {
                    System.out.println("Modo TURBO ativado");
                } else {
                    System.out.println("Valor de energia inválido");
                }

                sc.close();
    }
}
