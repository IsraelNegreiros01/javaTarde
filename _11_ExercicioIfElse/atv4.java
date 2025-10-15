package flowgorithmIntellij;

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Digite o cargo (operador/supervisor/engenheiro): ");
                String cargo = sc.nextLine().toLowerCase();

                if (cargo.equals("operador")) {
                    System.out.println("Acesso RESTRITO concedido");
                } else if (cargo.equals("supervisor")) {
                    System.out.println("Acesso PARCIAL concedido");
                } else if (cargo.equals("engenheiro")) {
                    System.out.println("Acesso TOTAL concedido");
                } else {
                    System.out.println("Cargo não reconhecido");
                }

                sc.close();
    }
}