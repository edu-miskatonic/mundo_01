import java.util.Scanner;

public class ex002 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome completo: ");
        String nome = entrada.nextLine();

        entrada.close();

        System.out.printf("O nome digitado foi: %d", nome);
    }
}
