public class Questao5 {
    public static void main(String[] args) {
            double piAnt = 0;
            double piAtua = 0;
            double termo = 1;
            int sinal = 1;
            int res = 0;

            while (true) {
                piAnt = piAtua;
                piAtua += sinal * (4 / termo);
                res++;

                System.out.println("Res " + res + ": PI = " + piAtua);

                if (Math.abs(piAtua - piAnt) <= 0.00000000005) {
                    break;
                }

                termo += 2;
                sinal *= -1;
            }

            System.out.println("\nValor final de PI calculado: " + piAtua);
            System.out.println("Resultado: " + res);
    }
}
