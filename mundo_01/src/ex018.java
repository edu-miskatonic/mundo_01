import java.util.Scanner;

public class ex018 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de um ângulo: ");
        double angulo = entrada.nextDouble();

        double seno = Math.toDegrees(Math.sin(angulo));
        double cosseno = Math.toDegrees(Math.cos(angulo));
        double tangente = Math.toDegrees(Math.tan(angulo)); 
        entrada.close();

        System.out.printf("valor do seno: %.2f\n", seno);
        System.out.printf("valor do cosseno: %.2f\n", cosseno);
        System.out.printf("valor da tangente: %.2f\n", tangente);
    }
}
