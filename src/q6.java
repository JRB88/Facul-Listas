import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = read.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = read.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = read.nextInt();
            }
        }

        int[] diagonal = ExtrairDiagonal(matriz);

        System.out.println("Diagonal principal:");

        for (int i = 0; i < diagonal.length; i++) {
            System.out.print(diagonal[i] + " ");
        }

        read.close();
    }

    private static int[] ExtrairDiagonal(int[][] matriz) {
        int tamanho = matriz.length;

        if (matriz[0].length < tamanho) {
            tamanho = matriz[0].length;
        }

        int[] diagonal = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            diagonal[i] = matriz[i][i];
        }

        return diagonal;
    }
}
