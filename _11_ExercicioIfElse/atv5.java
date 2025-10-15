package flowgorithmIntellij;

import java.util.Scanner;

public class atv5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite as horas de uso da máquina: ");
            int horasUso = sc.nextInt();

            if (horasUso < 500) {
                System.out.println("Urgência de manutenção: BAIXA");
            } else if (horasUso >= 500 && horasUso <= 1000) {
                System.out.println("Urgência de manutenção: MÉDIA");
            } else if (horasUso > 1000) {
                System.out.println("Urgência de manutenção: ALTA");
            }

            sc.close();
        }
}
