import java.util.Scanner;

public class q8 {

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

        double[] somaLinhas = SomaLinhas(matriz);
        double[] somaColunas = SomaColunas(matriz);
        double[] mediaLinhas = MediaLinhas(matriz);
        double[] mediaColunas = MediaColunas(matriz);
        double[] desvioLinhas = DesvioPadraoLinhas(matriz);
        double[] desvioColunas = DesvioPadraoColunas(matriz);

        System.out.println("Soma de cada linha:");

        for (int i = 0; i < somaLinhas.length; i++) {
            System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
        }

        System.out.println("Soma de cada coluna:");

        for (int i = 0; i < somaColunas.length; i++) {
            System.out.println("Coluna " + (i + 1) + ": " + somaColunas[i]);
        }

        System.out.println("Média de cada linha:");

        for (int i = 0; i < mediaLinhas.length; i++) {
            System.out.println("Linha " + (i + 1) + ": " + mediaLinhas[i]);
        }

        System.out.println("Média de cada coluna:");

        for (int i = 0; i < mediaColunas.length; i++) {
            System.out.println("Coluna " + (i + 1) + ": " + mediaColunas[i]);
        }

        System.out.println("Desvio padrão de cada linha:");

        for (int i = 0; i < desvioLinhas.length; i++) {
            System.out.println("Linha " + (i + 1) + ": " + desvioLinhas[i]);
        }

        System.out.println("Desvio padrão de cada coluna:");

        for (int i = 0; i < desvioColunas.length; i++) {
            System.out.println("Coluna " + (i + 1) + ": " + desvioColunas[i]);
        }

        read.close();
    }

    private static double[] SomaLinhas(int[][] matriz) {
        double[] resultado = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i] = resultado[i] + matriz[i][j];
            }
        }

        return resultado;
    }

    private static double[] SomaColunas(int[][] matriz) {
        double[] resultado = new double[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                resultado[j] = resultado[j] + matriz[i][j];
            }
        }

        return resultado;
    }

    private static double[] MediaLinhas(int[][] matriz) {
        double[] soma = SomaLinhas(matriz);
        double[] resultado = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            resultado[i] = soma[i] / matriz[i].length;
        }

        return resultado;
    }

    private static double[] MediaColunas(int[][] matriz) {
        double[] soma = SomaColunas(matriz);
        double[] resultado = new double[matriz[0].length];

        for (int i = 0; i < matriz[0].length; i++) {
            resultado[i] = soma[i] / matriz.length;
        }

        return resultado;
    }

    private static double[] DesvioPadraoLinhas(int[][] matriz) {
        double[] media = MediaLinhas(matriz);
        double[] resultado = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            double soma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                double diferenca = matriz[i][j] - media[i];
                soma = soma + diferenca * diferenca;
            }

            resultado[i] = Math.sqrt(soma / matriz[i].length);
        }

        return resultado;
    }

    private static double[] DesvioPadraoColunas(int[][] matriz) {
        double[] media = MediaColunas(matriz);
        double[] resultado = new double[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {
            double soma = 0;

            for (int i = 0; i < matriz.length; i++) {
                double diferenca = matriz[i][j] - media[j];
                soma = soma + diferenca * diferenca;
            }

            resultado[j] = Math.sqrt(soma / matriz.length);
        }

        return resultado;
    }
}
