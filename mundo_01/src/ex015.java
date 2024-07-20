import java.util.Scanner;

public class ex015 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias nos quais o carro ficou emprestado: ");
        int dias = entrada.nextInt();

        System.out.print("Digite a quantidade de Kms percorridos: ");
        double km = entrada.nextDouble();

        entrada.close();

        double valorTotal = (60 * dias) + (km * 0.15);

        System.out.printf("Valor total a ser pago pelo carro: R$%.2f", valorTotal);
    }
}
