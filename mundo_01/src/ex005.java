import java.util.Scanner;

public class ex005 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        entrada.close();

        System.out.printf("Antecessor: %d\n", numero - 1);
        System.out.printf("Sucessor: %d", numero + 1);
    }
}
