import java.util.Scanner;

public class ex010 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor em reais: ");
        double real = entrada.nextDouble();
        entrada.close();

        double dolar = real / 5.54;

        System.out.printf("Valor em dólar: %.2f", dolar);
    }
}
