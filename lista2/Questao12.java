import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite a taxa de juros (em % ao ano, ex: 5 para 5%): ");
        double tax = read.nextDouble();

        double taxaDec = tax / 100;
        double valorInicial = 1.0;
        double valorAt = valorInicial;
        int peri = 0;

        while (valorAt < valorInicial * 2) {
            valorAt += valorAt * taxaDec;
            peri++;
        }

        System.out.println("O investimento dobra em " + peri + " período(s).");
        System.out.println("Valor final após " + peri + " período(s): " + valorAt);
    }
}