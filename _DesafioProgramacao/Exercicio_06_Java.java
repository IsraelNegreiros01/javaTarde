package _DesafioProgramacao;

public class Exercicio_06_Java {
    public static void main(String[] args) {
        System.out.println("Tabuada de Multiplicação (1 a 10)");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.print("---+");
        for (int i = 1; i <= 10; i++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

}
