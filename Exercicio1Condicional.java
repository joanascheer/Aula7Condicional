import java.util.Scanner;

public class Exercicio1Condicional {
    public static void main(String[] args) {
        Scanner leNota1 = new Scanner(System.in);
        Scanner leNota2 = new Scanner(System.in);
        Scanner leNota3 = new Scanner(System.in);
        Scanner leNota4 = new Scanner(System.in);

        System.out.println("Digite N1: ");
        double n1 = leNota1.nextDouble();
        System.out.println("Digite N2: ");
        double n2 = leNota1.nextDouble();
        System.out.println("Digite N3: ");
        double n3 = leNota1.nextDouble();
        System.out.println("Digite N4: ");
        double n4 = leNota1.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.printf("O aluno foi aprovado com média %.2f ", media);
        } else {
            System.out.printf("O aluno foi reprovado com média %.2f ", media );
        }
    }
    /*Crie um algoritmo que receba 4 notas de um aluno, calcule a média
e exiba se o aluno foi aprovado ou não.
Obs: a média de aprovação é 7*/ 
}
