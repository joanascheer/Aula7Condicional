import java.util.Scanner;

public class Exercicio5Condicional {
    public static void main(String[] args) {
        // Abrindo Scanner pois vou coletar dados digitados pelo usuario
        Scanner leitor = new Scanner(System.in);

        /* Captando valores digitados com a variável criada (n1 e n2), chamando o leitor criado acima */
        System.out.println("Digite o primeiro valor: ");
        double n1 = leitor.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double n2 = leitor.nextDouble();

        /* Abrindo condição: Se os números forem iguais, o programa dá uma mensagem avisando, já que de acordo
        com o enunciado, os números digitados não podem ser iguais. Se n1 for maior que n2, ele avisa que n1 é maior.
        Se não (else), ou seja, se n2 for maior que n1, o programa avisa que n2 é maior. */
        if (n1 == n2) {
            System.out.println("Os valores não podem ser iguais.");
        } else if (n1 > n2) {
            System.out.println("O maior número é " +n1);
        } else {
            System.out.println("O maior número é " +n2);
        }
    }
    /*
    Ler dois valores (considere que não serão lidos valores iguais) e
    escrever o maior deles.
    */
}
