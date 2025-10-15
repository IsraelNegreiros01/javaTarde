package _01_estruturaSequencial;
import java.util.Scanner;
public class Exercicio_05_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo de venda, o numero de pecas compradas e o valor unitario da peca 1: ");
        double x;
        double y;
        double z;
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        System.out.println("Agora, digite as mesmas informações da peca 2:");
        double x1;
        double y1;
        double z1;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        z1 = sc.nextDouble();
        System.out.printf("valor a ser pago: %.2f%n" , ((y * z) + (y1 * z1)));
    }
}

