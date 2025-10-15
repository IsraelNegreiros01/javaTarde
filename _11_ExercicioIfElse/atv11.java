package flowgorithmIntellij;

import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o nível da bateria (%): ");
                double bateria = scanner.nextDouble();

                if (bateria < 20) {
                    System.out.println("RETORNO IMEDIATO à base");
                } else if (bateria >= 20 && bateria <= 60) {
                    System.out.println("Executar ROTA CURTA");
                } else if (bateria > 60) {
                    System.out.println("Executar ROTA LONGA");
                }

                scanner.close();
    }
}
