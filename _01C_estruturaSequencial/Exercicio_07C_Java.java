package _01C_estruturaSequencial;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Exercicio_07C_Java {
    public static void main(String[] args) {
        int Q, C, M;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos quilometros foram percorridos?");
        Q = sc.nextInt();
        System.out.println("Quantos litros de combustível foram consumidos ");
        C = sc.nextInt();
        M = Q+C;
        System.out.println("O consumo total foi: "+ M );
        }
    }

