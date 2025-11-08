package _20_ForEach;

public class Exercicio_02_Java {
    public static void main(String[] args) {
        String[] pls = {"sol", "nuvem", "lua", "astro", "mar", "computador"};

        System.out.print("Palavras com até 4 letras: ");
        for (String pl : pls) {
            if (pl.length() <= 4) {
                System.out.print(pl + " ");
            }
        }
    }
}
