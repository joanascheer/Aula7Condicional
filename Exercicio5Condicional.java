import java.util.Scanner;

public class Exercicio5Condicional {
    public static void main(String[] args) {
        Scanner len1 = new Scanner(System.in);
        Scanner len2 = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double n1 = len1.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double n2 = len2.nextDouble();

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
