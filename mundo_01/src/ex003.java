import java.util.Scanner;

public class ex003 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero01 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero02 = entrada.nextInt();

        entrada.close();
        int soma = numero01 + numero02;

        System.out.printf("A soma dos números vale: %d", soma);
    }
}
