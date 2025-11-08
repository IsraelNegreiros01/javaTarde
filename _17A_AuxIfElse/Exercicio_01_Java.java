package _17A_AuxIfElse;


import java.util.Scanner;

public class Exercicio_01_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Robôs Autônomos");
        System.out.println("Qual direção o robô vai (0-obstruído, 1-livre):");
        System.out.print("Sensor frontal: ");
        int frontal = sc.nextInt();
        System.out.print("Sensor direita: ");
        int direita = sc.nextInt();
        System.out.print("Sensor esquerda: ");
        int esquerda = sc.nextInt();

        String decisao = decidirMovimentoRobo(frontal, direita, esquerda);
        System.out.println("Decisão do robô: " + decisao);

        sc.close();
    }

    public static String decidirMovimentoRobo(int frontal, int direita, int esquerda) {
        if (frontal == 1) {

            return "Seguir em frente";
        } else if (direita == 1) {
            return "Desviar para direita";
        } else if (esquerda == 1) {
            return "Desviar para esquerda";
        } else {
            return "Parar - todos os sensores obstruídos";
        }
    }
}
