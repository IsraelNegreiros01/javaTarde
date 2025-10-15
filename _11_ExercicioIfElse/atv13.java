package flowgorithmIntellij;

import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a produção por hora: ");
                int producaoHora = scanner.nextInt();

                if (producaoHora < 50) {
                    System.out.println("Desempenho: BAIXO");
                } else if (producaoHora >= 50 && producaoHora <= 100) {
                    System.out.println("Desempenho: REGULAR");
                } else if (producaoHora > 100) {
                    System.out.println("Desempenho: ÓTIMO");
                }

                scanner.close();
    }
}
