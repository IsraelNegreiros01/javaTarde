package flowgorithmIntellij;

import java.util.Scanner;

public class Exercicio_01_flow {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Sensor frontal (true/false): ");
        boolean sensorFrontal = sc.nextBoolean();

        System.out.print("Sensor direita (true/false): ");
        boolean sensorDireita = sc.nextBoolean();

        System.out.print("Sensor esquerda (true/false): ");
        boolean sensorEsquerda = sc.nextBoolean();

        if (!sensorFrontal) {
            System.out.println("Robô segue em frente");
        } else if (!sensorEsquerda) {
            System.out.println("Robô desvia para esquerda");
        } else if (!sensorDireita) {
            System.out.println("Robô desvia para direita");
        } else {
            System.out.println("Robô para - todos os sensores detectam obstáculos");
        }

        sc.close();
    }
}
