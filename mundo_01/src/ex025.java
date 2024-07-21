import java.util.Scanner;

public class ex025 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto = entrada.nextLine();

        entrada.close();

        if (nomeCompleto.contains("Silva")) {
            System.out.print("O nome digitado contém Silva.");
        }
        else {
            System.out.print("O nome digitado não contém Silva.");
        }
    }
}
