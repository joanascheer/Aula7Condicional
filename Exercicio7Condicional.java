import java.util.Scanner;

public class Exercicio7Condicional {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int idade = leitor.nextInt();

        if(idade < 18) {
            System.out.println("Você é menor de idade.");
        } else {
            System.out.println("Você é maior de idade.");
        }
    }
    
}
