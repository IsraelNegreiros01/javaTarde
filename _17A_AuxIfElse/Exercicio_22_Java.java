package _17A_AuxIfElse;

import java.util.Scanner;

public class Exercicio_22_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, insira o indice de particulas");
        int x = sc.nextInt();
        String grau = Indice (x);
        System.out.println(grau);
        sc.close();
    }
    public static String Indice (int x) {
        if ( x < 50 ) {
            return "Indice bom";
        } else if ( x > 200 ) {
            return "Indice critico";
        } else if ( x >= 100 && x <= 200) {
            return "Indice ruim";
        }
        else {
            return "Indice moderado";
        }
    }
}
