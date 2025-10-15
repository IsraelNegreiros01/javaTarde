package Atividade_while_java;

import java.util.Scanner;

public class Ex_02_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        int m, z = 0;
        y = 0;
        System.out.println("insira a temperatura da maquina medida em cada hora");
        while ( y <=24) {
            x = sc.nextDouble();
            y = y + 1;
            z = (int) (z + x);
        }
        m = ( z / 24);
        System.out.println("media total das temperaturas medidas: " + m);
    }
}
