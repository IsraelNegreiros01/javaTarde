package flowgorithmIntellij;

import java.util.Scanner;

public class atv7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o peso do pacote (kg): ");
            double peso = sc.nextDouble();

            if (peso < 10) {
                System.out.println("Pacote LEVE");
            } else if (peso >= 10 && peso <= 30) {
                System.out.println("Pacote MÉDIO");
            } else if (peso > 30 && peso <= 60) {
                System.out.println("Pacote PESADO");
            } else if (peso > 60) {
                System.out.println("Pacote MUITO PESADO - cuidado especial necessário");
            }

            sc.close();
        }
    }
