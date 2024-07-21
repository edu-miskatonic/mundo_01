import java.util.Scanner;

public class ex017 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do cateto oposto: ");
        double catetoOposto = entrada.nextDouble();

        System.out.print("Digite o valor do cateto adjacente: ");
        double catetoadjacente = entrada.nextDouble();
        entrada.close();

        double hipotenusa = Math.sqrt(((catetoOposto * catetoOposto) + (catetoadjacente * catetoadjacente))); 

        System.out.printf("O valor da hipotenusa vale: %.2f", hipotenusa);
    }
}
