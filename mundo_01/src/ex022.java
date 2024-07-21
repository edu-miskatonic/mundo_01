import java.util.Scanner;

public class ex022 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        String nomeM = nome.toUpperCase();
        String nomem = nome.toLowerCase();
        int numero = nome.length();

        entrada.close();

        System.out.printf("O nome com todas as letras maiúsculas: %s\n", nomeM);
        System.out.printf("O nome com todas as letras minúsculas: %s\n", nomem);
        System.out.printf("Quantas letras possui ao todo: %d", numero);
    }
}
