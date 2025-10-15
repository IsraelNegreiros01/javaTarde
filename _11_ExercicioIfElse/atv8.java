package flowgorithmIntellij;

import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Digite a quantidade restante de material (%): ");
                double material = sc.nextDouble();

                if (material < 20) {
                    System.out.println("TROCAR material imediatamente!");
                } else {
                    System.out.println("CONTINUAR impressão - material suficiente");
                }

                sc.close();
    }
}