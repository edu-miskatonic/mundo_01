import java.util.Scanner;
import java.util.Random;

public class ex028 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.print("Digite um número aleatório entre 0 ~ 5: ");
        int numero = entrada.nextInt();
        int numeroAleatorio = aleatorio.nextInt(6);

        entrada.close();
        if (numeroAleatorio == numero) {
            System.out.println("O usuário acertou o número digitado pela máquina.");
        }
        else {
            System.out.println("O usuário errou o número digitado pela máquina.");
        }
        System.out.println(numeroAleatorio);
    }
}
