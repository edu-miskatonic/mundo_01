import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class ex019 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        Random novo = new Random();

        System.out.print("Digite o nome do primeiro aluno: ");
        String primeiroAluno = entrada.nextLine();

        System.out.print("Digite o nome do segundo aluno: ");
        String segundoAluno = entrada.nextLine();

        System.out.print("Digite o nome do terceiro aluno: ");
        String terceiroAluno = entrada.nextLine();

        System.out.print("Digite o nome do quarto aluno: ");
        String quartoAluno = entrada.nextLine();

        lista.add(primeiroAluno);
        lista.add(segundoAluno);
        lista.add(terceiroAluno);
        lista.add(quartoAluno);
        
        int itens = novo.nextInt(lista.size());
        System.out.print(itens);

        entrada.close();
        System.out.printf("O aluno sorteado foi: %s", lista.get(itens));
    }
}
