package _20_ForEach;

public class Exercicio_04_Java {
    public static void main(String[] args) {
        int[] nts = {70, 45, 85, 30, 95, 55, 60};

        System.out.println("Relatório de Notas:");
        for (int nt : nts) {
            String situacao = (nt >= 60) ? "Aprovado" : "Reforço";
            System.out.println("Nota: " + nt + " → " + situacao);
        }
    }
}
