package _17A_AuxIfElse;

import java.util.Scanner;

public class Exercicio_02_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Produção Automatizada");
        System.out.println("Digite o código do estado da peça (1-4):");
        System.out.println("1 - Aprovado | 2 - Reprovado | 3 - Retrabalho | 4 - Análise Manual");
        int codigo = sc.nextInt();

        String estado = classificarPeca(codigo);
        System.out.println("Estado da peça: " + estado);

        sc.close();
    }

    public static String classificarPeca(int codigo) {
        if (codigo == 1) {
            return "Aprovado";
        } else if (codigo == 2) {
            return "Reprovado";
        } else if (codigo == 3) {
            return "Retrabalho";
        } else if (codigo == 4) {
            return "Análise Manual";
        } else {
            return "Código inválido";
        }
    }
}
