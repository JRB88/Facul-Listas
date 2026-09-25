import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("| Conversões |");
        System.out.println("Dólar para Real - 1");
        System.out.println("Celsius para Fahrenheit - 2");
        System.out.println("Dias para anos, meses e dias - 3");
        System.out.println("Km/h para m/s - 4");

        System.out.print("Escolha uma opção: ");
        int numin = read.nextInt();

        if (numin == 1) {
            System.out.print("Digite o valor em dólares: ");
            double dolar = read.nextDouble();

            System.out.print("Digite a cotação do dólar: ");
            double cotacao = read.nextDouble();

            double resultado = Dolreal(dolar, cotacao);

            System.out.println("Valor em reais: R$" + resultado);

        } else if (numin == 2) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = read.nextDouble();

            double resultado = CelsiusFahrenheit(celsius);

            System.out.println("Temperatura em Fahrenheit: " + resultado + " °F");

        } else if (numin == 3) {
            System.out.print("Digite a quantidade de dias: ");
            int dias = read.nextInt();

            DiasParaAnosMesesDias(dias);

        } else if (numin == 4) {
            System.out.print("Digite a velocidade em km/h: ");
            double kmh = read.nextDouble();

            double resultado = KmHParaMs(kmh);

            System.out.println("Velocidade em m/s: " + resultado);

        } else {
            System.out.println("Opção inválida");
        }

        read.close();
    }

    private static double Dolreal(double dolar, double cotacao) {
        return dolar * cotacao;
    }

    private static double CelsiusFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static void DiasParaAnosMesesDias(int dias) {
        int anos = dias / 365;
        dias = dias % 365;

        int meses = dias / 30;
        dias = dias % 30;

        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);
    }

    private static double KmHParaMs(double kmh) {
        return kmh / 3.6;
    }
}
