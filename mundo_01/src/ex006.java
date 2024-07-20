import java.util.Scanner;

public class ex006 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = entrada.nextInt();

        entrada.close();

        double dobro = numero * 2;
        double triplo = numero * 3;
        double raiz = Math.sqrt(numero); 

        System.out.printf("O dobro vale: %.2f\n", dobro);
        System.out.printf("O triplo vale: %.2f\n", triplo);
        System.out.printf("A raiz quadrada vale: %.2f", raiz);
    }
}
