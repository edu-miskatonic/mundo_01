import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma temperatura em ºF: ");
        double f = entrada.nextDouble();

        double c = (f * 1.8) + 32;
        entrada.close();

        System.out.printf("A temperatura digitada em graus Farenheit, vale ºC: %.2f", c);
    }
}
