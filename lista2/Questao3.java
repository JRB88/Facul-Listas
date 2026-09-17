import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        double soma = 0.0;
        for (int i = 1; i <= N; i++) {
            soma += 1.0 / (2 * i);
        }
        System.out.println(soma);
    }
}
