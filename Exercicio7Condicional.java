import java.util.Scanner;

public class Exercicio7Condicional {
    public static void main(String[] args) {
        
        // Abrindo Scanner para captar dados que o usuário vai digitar
        Scanner leitor = new Scanner(System.in);
        
        // Armazenando dado digitado na variável idade
        System.out.println("Qual a sua idade? ");
        int idade = leitor.nextInt();

        /* Verificando se a idade é menor de 18. Se sim, o programa avisa que o usuario é menor de idade.
        Se não (else), o programa avisa que é maior de idade. */
       
        if(idade < 18) {
            System.out.println("Você é menor de idade.");
        } else {
            System.out.println("Você é maior de idade.");
        }
    }
    
}

/*
Faça um programa que receba a idade de um usuário e diga se ele é
maior de idade ou não
*/
