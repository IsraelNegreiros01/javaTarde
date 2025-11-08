package _17A_AuxIfElse;

import java.util.Scanner;

public class Exercicio_27_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, houve algum erro?");
        String erro_1 = sc.next();
        String ola = Erros (erro_1);
        System.out.println(ola);
        if ( ola.equalsIgnoreCase("Qual tipo de erro ocorreu?")) {
            String erro_2 = sc.next();
            String oi = MaisErros (erro_2);
            System.out.println(oi);
            sc.close();
        }
        sc.close();
    }
    public static String Erros ( String erro_1 ) {
        if ( erro_1.equals("Sim")) {
            return "Qual tipo de erro ocorreu?";
        }
        else {
            return "Continuar produção";
        }
    }
    public static String MaisErros ( String erro_2 ) {
        if ( erro_2.equals("critico")) {
            return "Parar linha";
        }
        else {
            return "Acionar manutenção";
        }
    }
}
