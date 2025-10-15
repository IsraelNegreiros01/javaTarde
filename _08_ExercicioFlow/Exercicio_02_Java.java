package _08_ExercicioFlow;

import java.util.Scanner;

public class Exercicio_02_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double x;
        System.out.println("programa iniciado, insira o valor do estoque");
        x = sc.nextDouble();
        if (x < 20) {
            System.out.println("alerta, reeabastecer imediatamente");
        }
        else {
            System.out.println("estoque suficiente");
        }

}
}
