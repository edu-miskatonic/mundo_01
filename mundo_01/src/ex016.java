import java.util.Scanner;

public class ex016 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = entrada.nextDouble();

        double inteiro = Math.abs(numero);
        entrada.close();

        System.out.printf("A porção inteira vale: %.0f", inteiro);
    }
}
