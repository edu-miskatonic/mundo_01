import java.util.Scanner;

public class ex009 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        entrada.close();

        System.out.printf("%d x 0, vale: %d\n", numero, numero * 0);
        System.out.printf("%d x 1, vale: %d\n", numero, numero * 1);
        System.out.printf("%d x 2, vale: %d\n", numero, numero * 2);
        System.out.printf("%d x 3, vale: %d\n", numero, numero * 3);
        System.out.printf("%d x 4, vale: %d\n", numero, numero * 4);
        System.out.printf("%d x 5, vale: %d\n", numero, numero * 5); 
        System.out.printf("%d x 6, vale: %d\n", numero, numero * 6);
        System.out.printf("%d x 7, vale: %d\n", numero, numero * 7);
        System.out.printf("%d x 8, vale: %d\n", numero, numero * 8);
        System.out.printf("%d x 9, vale: %d\n", numero, numero * 9);
        System.out.printf("%d x 10, vale: %d", numero, numero * 10);
    }
}
