package _11_ExercicioIfElse;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/n=== Sistema de robôs autônomos ===");
        System.out.print("Sensor frontal (true/false)");
        ;
        boolean frontal = sc.hasNextBoolean();
        System.out.print("Sensor direita (true/false)");
        ;
        boolean direita = sc.hasNextBoolean();
        System.out.print("Sensor esquerda (true/false)");
        ;
        boolean esquerda = sc.hasNextBoolean();
        if (!frontal) {
            System.out.println("Ação: Seguir em frente");
            ;
        } else if (!direita) {
            System.out.println("Ação: Desviar para direita");
            ;
        } else if (!esquerda) {
            System.out.println("Ação: Desviar para esquerda");
            ;
        } else{
            System.out.println("Ação: Parar - Todos os caminhos estão bloqueados");
        }
        }
    }
