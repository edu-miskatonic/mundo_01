import java.util.Scanner;

public class ex013 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = entrada.nextDouble();

        entrada.close();

        double novoSalario = salario + ((salario * 15) / 100);

        System.out.printf("Novo salário: %.2f", novoSalario);
    }
}
