package flowgorithmIntellij;

import java.util.Scanner;

public class atv6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a distância do obstáculo (metros): ");
            double distancia = sc.nextDouble();

            if (distancia < 5) {
                System.out.println("FREAR imediatamente!");
            } else if (distancia >= 5 && distancia <= 15) {
                System.out.println("Reduzir velocidade");
            } else if (distancia > 15) {
                System.out.println("Acelerar - via livre");
            }

            sc.close();
        }
    }
