package flowgorithmIntellij;

import java.util.Scanner;

public class atv15 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a temperatura da máquina (°C): ");
                double temperatura = scanner.nextDouble();

                System.out.print("Digite o nível de vibração (%): ");
                double vibracao = scanner.nextDouble();

                if (temperatura > 90 || vibracao > 80) {
                    System.out.println("EMERGÊNCIA! Desligar máquina imediatamente!");
                } else {
                    System.out.println("Máquina operando normalmente");
                }

                scanner.close();
    }
}
