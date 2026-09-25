import java.util.Scanner;

public class q12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        char[][] jogo = new char[3][3];

        InicializarJogo(jogo);

        char jogador = 'X';
        boolean venceu = false;

        for (int rodada = 0; rodada < 9 && !venceu; rodada++) {

            ImprimirJogo(jogo);

            System.out.println("Jogador " + jogador);

            System.out.print("Digite a linha de 1 a 3: ");
            int linha = read.nextInt() - 1;

            System.out.print("Digite a coluna de 1 a 3: ");
            int coluna = read.nextInt() - 1;

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posição inválida.");
                rodada--;
                continue;
            }

            if (jogo[linha][coluna] != ' ') {
                System.out.println("Essa posição já está ocupada.");
                rodada--;
                continue;
            }

            jogo[linha][coluna] = jogador;

            venceu = VerificarVitoria(jogo);

            if (venceu) {
                ImprimirJogo(jogo);
                System.out.println("Jogador " + jogador + " venceu!");
            } else {
                if (jogador == 'X') {
                    jogador = 'O';
                } else {
                    jogador = 'X';
                }
            }
        }

        if (!venceu) {
            ImprimirJogo(jogo);
            System.out.println("Empate!");
        }

        read.close();
    }

    private static void InicializarJogo(char[][] jogo) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogo[i][j] = ' ';
            }
        }
    }

    private static void ImprimirJogo(char[][] jogo) {
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(" " + jogo[i][0] + " | " + jogo[i][1] + " | " + jogo[i][2]);

            if (i < 2) {
                System.out.println("---+---+---");
            }
        }

        System.out.println();
    }

    private static boolean VerificarVitoria(char[][] jogo) {

        for (int i = 0; i < 3; i++) {
            if (jogo[i][0] != ' ' &&
                    jogo[i][0] == jogo[i][1] &&
                    jogo[i][1] == jogo[i][2]) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (jogo[0][j] != ' ' &&
                    jogo[0][j] == jogo[1][j] &&
                    jogo[1][j] == jogo[2][j]) {
                return true;
            }
        }

        if (jogo[0][0] != ' ' &&
                jogo[0][0] == jogo[1][1] &&
                jogo[1][1] == jogo[2][2]) {
            return true;
        }

        if (jogo[0][2] != ' ' &&
                jogo[0][2] == jogo[1][1] &&
                jogo[1][1] == jogo[2][0]) {
            return true;
        }

        return false;
    }
}
