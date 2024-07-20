import java.util.Scanner;

public class ex012 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = entrada.nextDouble();

        entrada.close();

        double novoPreco = preco - ((preco * 5) / 100);

        System.out.printf("O novo preço vale: %.2f", novoPreco);
    }
}
