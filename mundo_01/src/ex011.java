import java.util.Scanner;

public class ex011 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a altura da parede: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite a largura da parede: ");
        double largura = entrada.nextDouble();
        entrada.close();

        double area = altura * largura;
        double tinta = area / 2;

        System.out.printf("Para pintar um quarto com uma área de: %.2f\n", area);
        System.out.printf("Serão necessários %.2f baldes de tinta.", tinta);
    }
}
