import java.util.Scanner;

public class q11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = read.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = read.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os valores da matriz de 0 a 63:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = read.nextInt();
            }
        }

        int maior = Histograma(matriz, linhas, colunas);

        System.out.println("Valor que mais apareceu: " + maior);

        read.close();
    }

    private static int Histograma(int[][] matriz, int linhas, int colunas) {
        int[] frequencia = new int[64];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] >= 0 && matriz[i][j] <= 63) {
                    frequencia[matriz[i][j]]++;
                }
            }
        }

        System.out.println("Histograma:");

        for (int i = 0; i < frequencia.length; i++) {
            System.out.println(i + ": " + frequencia[i]);
        }

        int maior = 0;

        for (int i = 1; i < frequencia.length; i++) {
            if (frequencia[i] > frequencia[maior]) {
                maior = i;
            }
        }

        return maior;
    }
}
