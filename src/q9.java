import java.util.Random;
import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite a quantidade de sorteios: ");
        int n = read.nextInt();

        int[][] matriz = CriarMatrizCoocorrencia(n);

        System.out.println("Matriz de coocorrência:");

        ImprimirMatriz(matriz);

        int[] maior = MaiorElemento(matriz);

        System.out.println("Maior elemento: " + matriz[maior[0]][maior[1]]);
        System.out.println("Linha: " + maior[0]);
        System.out.println("Coluna: " + maior[1]);

        System.out.println("Números com maior correlação nos sorteios:");
        System.out.println(maior[0] + " e " + maior[1]);

        read.close();
    }

    private static int[][] CriarMatrizCoocorrencia(int n) {
        int[][] matriz = new int[11][11];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int num1 = random.nextInt(11);
            int num2 = random.nextInt(11);

            matriz[num1][num2]++;
        }

        return matriz;
    }

    private static int[] MaiorElemento(int[][] matriz) {
        int maior = matriz[0][0];
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        int[] resultado = new int[2];

        resultado[0] = linha;
        resultado[1] = coluna;

        return resultado;
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
