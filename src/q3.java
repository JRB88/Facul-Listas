import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = read.nextLine();

        System.out.print("Digite uma substring: ");
        String substring = read.nextLine();

        int resultado = EncontrarSubstring(texto, substring);

        System.out.println("Posição encontrada: " + resultado);

        read.close();
    }

    private static int EncontrarSubstring(String texto, String substring) {
        for (int i = 0; i <= texto.length() - substring.length(); i++) {

            boolean encontrou = true;

            for (int j = 0; j < substring.length(); j++) {
                if (texto.charAt(i + j) != substring.charAt(j)) {
                    encontrou = false;
                    break;
                }
            }

            if (encontrou) {
                return i;
            }
        }

        return -1;
    }
}
