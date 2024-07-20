import java.util.Scanner;

public class ex008 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");
        double metros = entrada.nextDouble();
        entrada.close();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.printf("Valor em centímetros: %.2f\n", centimetros);
        System.out.printf("Valor em milimetros: %.2f", milimetros);
    }
}
