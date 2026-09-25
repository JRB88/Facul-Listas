import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz: ");
        int n = read.nextInt();

        int[][] matriz = MatrizIdentidade(n);

        System.out.println("Matriz identidade:");

        ImprimirMatriz(matriz);

        read.close();
    }

    private static int[][] MatrizIdentidade(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        return matriz;
    }

    private static void ImprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
}
