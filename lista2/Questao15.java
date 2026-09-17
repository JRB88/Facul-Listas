import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] produtos = new String[50];
        int i = 0;
        boolean sis = true;
        while (sis == true) {
            System.out.println("\n |Gerenciamento de Estoque|");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Verificar produtos");
            System.out.println("4 - Sair");
            int esco = read.nextInt();

            if (esco == 1) {
                if (i < 50) {
                    System.out.print("Digite o nome do produto: ");
                    produtos[i] = read.next();
                    i++;
                } else {
                    System.out.println("Estoque cheio");
                }
            }
            else if (esco == 2) {
                if (i == 0) {
                    System.out.println("Não ha produtos para remover.");
                } else {
                    System.out.println("Produtos cadastrados:");
                    for (int j = 0; j < i; j++) {
                        System.out.println((j + 1) + " - " + produtos[j]);
                    }
                    System.out.print("Digite o numero do produto que deseja remover: ");
                    int pos = read.nextInt() - 1;

                    if (pos >= 0 && pos < i) {
                        for (int j = pos; j < i - 1; j++) {
                            produtos[j] = produtos[j + 1];
                        }
                        produtos[i - 1] = null;
                        i--;
                        System.out.println("Produto removido");
                    } else {
                        System.out.println("invalido");
                    }
                }
            }
            else if (esco == 3) {
                if (i == 0) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    System.out.println("Produtos em estoque:");
                    for (int j = 0; j < i; j++) {
                        System.out.println((j + 1) + " - " + produtos[j]);
                    }
                }
            }
            else if (esco == 4) {
                sis = false;
            }
            else {
                System.out.println("Opção invalida");
            }
        }
    }
}