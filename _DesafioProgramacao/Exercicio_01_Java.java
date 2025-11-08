package _DesafioProgramacao;
import java.util.Scanner;
public class Exercicio_01_Java {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Programa iniciado");
            System.out.print("Quantos termos da sequência de Fibonacci você quer gerar? ");
            int x = sc.nextInt();

            long y = 0;
            long z = 1;
            int contador = 1;

            System.out.println("Sequência Mágica de Fibonacci:");

            while (contador <= x) {

                System.out.print(y);


                boolean ehPrimo = true;

                if (y < 2) {
                    ehPrimo = false;
                } else {
                    long divisor = 2;
                    while (divisor <= y / 2) {
                        if (y % divisor == 0) {
                            ehPrimo = false;
                            break;
                        }
                        divisor++;
                    }
                }


                if (ehPrimo) {
                    System.out.print("*");
                }

                System.out.print("  ");


                long proximo = y + z;
                y = z;
                z = proximo;

                contador++;
            }
        }
    }

