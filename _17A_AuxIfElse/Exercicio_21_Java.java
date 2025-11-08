package _17A_AuxIfElse;

import java.util.Scanner;

public class Exercicio_21_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, insira o peso da carga do veiculo");
        int x = sc.nextInt();
        String carga = Peso(x);
        System.out.println(carga);
        sc.close();
    }
    public static String Peso( int x ) {
        if ( x < 500 ) {
            return "Veiculo permitido";
        } else if ( x > 1000 ) {
           return "Veiculo proibido";
        }
        else {
            return "Alerta";
        }
    }
}
