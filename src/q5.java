import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = read.nextInt();

        num = MultiplicarPorDois(num);

        System.out.println("Valor de num no main: " + num);

        read.close();
    }

    private static int MultiplicarPorDois(int num) {
        num = num * 2;

        System.out.println("Valor de num no método: " + num);

        return num;
    }
}
