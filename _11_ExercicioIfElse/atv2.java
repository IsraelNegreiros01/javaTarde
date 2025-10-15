package _11_ExercicioIfElse;

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {

    }
    Scanner sc = new Scanner(System.in);
    public static void producaoAutomatizada(int codigo) {
        if (codigo == 1) {
            System.out.println("Peça Aprovada");
        } else if (codigo == 2) {
            System.out.println("Peça Reprovada");
        } else if (codigo == 3) {
            System.out.println("Peça em Retrabalho");
        } else if (codigo == 4) {
            System.out.println("Peça em Análise Manual");
        } else {
            System.out.println("Código inválido");
        }
    }
}
