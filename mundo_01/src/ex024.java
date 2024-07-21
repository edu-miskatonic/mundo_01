import java.util.Scanner;

public class ex024 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome de uma cidade: ");
        String nomeCidade = entrada.nextLine();

        String nomeSeparado = nomeCidade.toString();

        if (nomeSeparado.startsWith("Santos")) {
            System.out.print("O nome da cidade começa com Santos.");
        }
        else {
            System.out.print("O nome da cidade não começa com Santos.");
        }
        entrada.close();
    }
}
