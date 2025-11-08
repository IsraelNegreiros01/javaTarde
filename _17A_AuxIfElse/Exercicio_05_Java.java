package _17A_AuxIfElse;

import java.util.Scanner;

public class Exercicio_05_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Manutenção Preventiva");
        System.out.print("Quantas horas de uso da máquina: ");
        int horasUso = sc.nextInt();

        String urgencia = classificarUrgenciaManutencao(horasUso);
        System.out.println("Nível de urgência: " + urgencia);

        sc.close();
    }

    public static String classificarUrgenciaManutencao(int horas) {
        if (horas < 500) {
            return "Baixa";
        } else if (horas <= 1000) {
            return "Média";
        } else {
            return "Alta";
        }
    }
}
