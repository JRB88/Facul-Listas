import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("| Operações com Matrizes |");
        System.out.println("1 - Multiplicar as matrizes");
        System.out.println("2 - Somar as matrizes");
        System.out.println("3 - Verificar matriz identidade");
        System.out.println("4 - Transpor uma matriz");
        System.out.println("5 - Imprimir uma matriz");

        System.out.print("Escolha uma opção: ");
        int numin = read.nextInt();

        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhas1 = read.nextInt();

        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunas1 = read.nextInt();

        int[][] matriz1 = new int[linhas1][colunas1];

        LerMatriz(matriz1, read);

        if (numin == 1 || numin == 2) {
            System.out.print("Digite o número de linhas da segunda matriz: ");
            int linhas2 = read.nextInt();

            System.out.print("Digite o número de colunas da segunda matriz: ");
            int colunas2 = read.nextInt();

            int[][] matriz2 = new int[linhas2][colunas2];

            LerMatriz(matriz2, read);

            if (numin == 1) {
                if (colunas1 == linhas2) {
                    int[][] resultado = MultiplicarMatrizes(matriz1, matriz2);

                    System.out.println("Resultado da multiplicação:");
                    ImprimirMatriz(resultado);
                } else {
                    System.out.println("Não é possível multiplicar as matrizes.");
                }

            } else {
                if (linhas1 == linhas2 && colunas1 == colunas2) {
                    int[][] resultado = SomarMatrizes(matriz1, matriz2);

                    System.out.println("Resultado da soma:");
                    ImprimirMatriz(resultado);
                } else {
                    System.out.println("Não é possível somar as matrizes.");
                }
            }

        } else if (numin == 3) {
            if (MatrizIdentidade(matriz1)) {
                System.out.println("A matriz é uma matriz identidade.");
            } else {
                System.out.println("A matriz não é uma matriz identidade.");
            }

        } else if (numin == 4) {
            int[][] resultado = TransporMatriz(matriz1);

            System.out.println("Matriz transposta:");
            ImprimirMatriz(resultado);

        } else if (numin == 5) {
            System.out.println("Matriz:");
            ImprimirMatriz(matriz1);

        } else {
            System.out.println("Opção inválida");
        }

        read.close();
    }

    private static void LerMatriz(int[][] matriz, Scanner read) {
        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = read.nextInt();
            }
        }
    }

    private static int[][] MultiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas = matriz1.length;
        int colunas = matriz2[0].length;

        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz2.length; k++) {
                    resultado[i][j] = resultado[i][j] + matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    private static int[][] SomarMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    private static boolean MatrizIdentidade(int[][] matriz) {
        if (matriz.length != matriz[0].length) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j && matriz[i][j] != 1) {
                    return false;
                }

                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int[][] TransporMatriz(int[][] matriz) {
        int[][] transposta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
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
