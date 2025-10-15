package flowgorithmIntellij;

import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Crachá válido? (true/false): ");
                boolean crachaValido = scanner.nextBoolean();

                System.out.print("Usando capacete? (true/false): ");
                boolean capacete = scanner.nextBoolean();

                System.out.print("No horário de turno? (true/false): ");
                boolean horarioTurno = scanner.nextBoolean();

                if (crachaValido && capacete && horarioTurno) {
                    System.out.println("ACESSO PERMITIDO");
                } else {
                    System.out.println("ACESSO NEGADO");
                    if (!crachaValido) System.out.println("- Crachá inválido");
                    if (!capacete) System.out.println("- Capacete não detectado");
                    if (!horarioTurno) System.out.println("- Fora do horário de turno");
                }

                scanner.close();
    }
}
