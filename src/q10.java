import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String[] pessoas = {
                "Joao",
                "Teresa",
                "Raimundo",
                "Maria",
                "Joaquim",
                "Lili",
                "Carlos",
                "J. Pinto Fernandes"
        };

        int[][] amor = new int[8][8];

        amor[0][2] = 1;
        amor[1][2] = 1;
        amor[2][3] = 1;
        amor[3][4] = 1;
        amor[4][5] = 1;

        System.out.println("Matriz do amor:");

        System.out.print("             ");

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print(pessoas[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print(pessoas[i] + " ");

            for (int j = 0; j < pessoas.length; j++) {
                System.out.print("      " + amor[i][j]);
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Quem cada pessoa ama:");

        for (int i = 0; i < pessoas.length; i++) {
            boolean ama = false;

            System.out.print(pessoas[i] + " ama: ");

            for (int j = 0; j < pessoas.length; j++) {
                if (amor[i][j] == 1) {
                    System.out.print(pessoas[j] + " ");
                    ama = true;
                }
            }

            if (!ama) {
                System.out.print("ninguem");
            }

            System.out.println();
        }

        read.close();
    }
}
