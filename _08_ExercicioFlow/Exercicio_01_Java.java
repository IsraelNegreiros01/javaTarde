package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_01_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira aqui a temperatura atual da maquina");
        x = sc.nextDouble();
        if(x > 80){
            System.out.println("Alerta, maquina desligada por superaquecimento");

        }
        else {
            System.out.println("ok, maquina funcionando normalmente");
        }
    }
}
