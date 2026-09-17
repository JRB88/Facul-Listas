import java.util.Scanner;

public class Questao14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String pal = read.next();

        System.out.println("\nAnagramas de \"" + pal + "\":");
        gerarAnagramas("", pal);
    }

    public static void gerarAnagramas(String pref, String rest) {
        int tam = rest.length();

        if (tam == 0) {
            System.out.println(pref);
        } else {
            for (int i = 0; i < tam; i++) {
                char letrEsc = rest.charAt(i);


                String novRest = rest.substring(0, i) + rest.substring(i + 1, tam);


                gerarAnagramas(pref + letrEsc, novRest);
            }
        }
    }
}