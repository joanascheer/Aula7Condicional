import java.util.Scanner;

public class Exercicio1Condicional {
    public static void main(String[] args) {
        // Criando o leitor para captar o número digitado pelo usuário
        Scanner leNota = new Scanner(System.in);

        // Criando local para digitação das notas
        System.out.println("Digite N1: ");
        double n1 = leNota.nextDouble();
        System.out.println("Digite N2: ");
        double n2 = leNota.nextDouble();
        System.out.println("Digite N3: ");
        double n3 = leNota.nextDouble();
        System.out.println("Digite N4: ");
        double n4 = leNota.nextDouble();

        // Calculando a média
        double media = (n1 + n2 + n3 + n4) / 4;

        // Se a média for maior ou igual a 7, o aluno está aprovado. Se não (else), está reprovado.
        if (media >= 7) {
            System.out.printf("O aluno foi aprovado com média %.2f ", media);

        } else {
            System.out.printf("O aluno foi reprovado com média %.2f ", media );
        }
    }
    
    /*  Crie um algoritmo que receba 4 notas de um aluno, calcule a média
        e exiba se o aluno foi aprovado ou não.
        Obs: a média de aprovação é 7   */
}
