import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int soma = 0;
        int N = read.nextInt();
        for (int i = 0; i <= N; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}