package _17_Lista_DoWhile;
import java.util.Random;
public class Ex_18_Java {
    public static void main(String[] args) {
        Random rand = new Random();

        int x;
        int y = 0;
        int z = 0;
        double media;
x = rand.nextInt(51);
        System.out.println("iniciando balanceamento de linha");
        System.out.println("takt informado: " + x);

        do {
            double tempo = rand.nextInt(31);
            y += tempo;
            z++;
            media = y / z;

        } while (media > x);
        System.out.println("Média final: " + media);
        System.out.println("Quantidade de estações: " + z);
    }
}

