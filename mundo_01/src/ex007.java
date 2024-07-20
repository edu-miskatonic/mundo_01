import java.util.Scanner;

public class ex007 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota do aluno: ");
        double nota01 = entrada.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        double nota02 = entrada.nextDouble();

        double media = (nota01 + nota02) / 2;
        entrada.close();

        System.out.printf("A média vale: %.2f", media);
    }
}
