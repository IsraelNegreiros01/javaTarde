package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_03_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira aqui a energia restante do robo");
        x = sc.nextDouble();
        if (x <= 50){
            System.out.println("alerta, energia insuficiente, regarregar");
        }
        else {
            System.out.println("robo iniciando pintura");
        }
    }
}
