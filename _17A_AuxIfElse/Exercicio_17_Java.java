package _17A_AuxIfElse;

import java.util.Scanner;

public class Exercicio_17_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, o robo A falhou?");
        String A = sc.next();
        System.out.println(opcaoA(A));
        if(opcaoA(A).equalsIgnoreCase("Ok, acionar robo B")){
            System.out.println("E o robo B, falhou?");
            String B = sc.next();
            System.out.println(opcaoB(B));
            sc.close();
        }
        sc.close();
    }
    public static String opcaoA(String A) {
        if ( A.equalsIgnoreCase("Sim")){
            return "Ok, acionar robo B";
        }
        else {
            return "Ok, continuar producao";
        }
    }
    public static String opcaoB(String B) {
        if( B.equalsIgnoreCase("Sim")) {
            return "Ok, parar producao";
        }
        else {
            return "Ok, continuar producao";
        }
    }
}

