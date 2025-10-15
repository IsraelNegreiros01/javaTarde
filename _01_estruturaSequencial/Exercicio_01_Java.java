package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_01_Java{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x;
        int y;
        System.out.println("Digite o primeiro numero");
        x= sc.nextInt();
        System.out.println("Digite o segundo numero");
        y= sc.nextInt();
        int z= x+y;
    System.out.println("Soma dos dois numeros digitados: "+z);


    }
}
