package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_05_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("programa iniciado, insira aqui a velocidade atual do veiculo");
        x = sc.nextDouble();
        if (x > 120) {
            System.out.println("perigo, reduzir velocidade imediatamente");
        }
        else {
            System.out.println("velocidade dentro do limite");
        }
    }
}
