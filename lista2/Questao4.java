import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int A = read.nextInt();
        double soma = 0.0;
        int J = 3;
        for (int i = 1; i <= 40; i++) {
            J = J*2;
            soma += 7.0* A / J;
        }
        System.out.println(soma);
    }
}
