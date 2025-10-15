package flowgorithmIntellij;

import java.util.Scanner;

public class Exercicio_02_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do estado da peça (1-4): ");
        int codigo = sc.nextInt();

        if (codigo == 1) {
            System.out.println("Peça APROVADA");
        } else if (codigo == 2) {
            System.out.println("Peça REPROVADA");
        } else if (codigo == 3) {
            System.out.println("Peça para RETRABALHO");
        } else if (codigo == 4) {
            System.out.println("Peça para ANÁLISE MANUAL");
        } else {
            System.out.println("Código inválido!");
        }

        sc.close();
    }
}
