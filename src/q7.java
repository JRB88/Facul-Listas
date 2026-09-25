import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhas1 = read.nextInt();

        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunas1 = read.nextInt();

        int[][] matriz1 = new int[linhas1][colunas1];

        System.out.println("Digite os valores da primeira matriz:");

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                matriz1[i][j] = read.nextInt();
            }
        }

        System.out.print("Digite o número de linhas da segunda matriz: ");
        int linhas2 = read.nextInt();

        System.out.print("Digite o número de colunas da segunda matriz: ");
        int colunas2 = read.nextInt();

        int[][] matriz2 = new int[linhas2][colunas2];

        System.out.println("Digite os valores da segunda matriz:");

        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                matriz2[i][j] = read.nextInt();
            }
        }

        int resultado = ContarRepetidos(matriz1, matriz2);

        System.out.println("Quantidade de elementos repetidos: " + resultado);

        read.close();
    }

    private static int ContarRepetidos(int[][] matriz1, int[][] matriz2) {
        int contador = 0;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {

                for (int x = 0; x < matriz2.length; x++) {
                    for (int y = 0; y < matriz2[x].length; y++) {

                        if (matriz1[i][j] == matriz2[x][y]) {
                            contador++;
                            break;
                        }
                    }
                }
            }
        }

        return contador;
    }
}
