import java.util.Scanner;

public class Exercicio2Condicional {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Coletando altura e peso do usuário
        System.out.println("Digite sua altura: ");
        double altura = leitor.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = leitor.nextDouble();

        // Calculando IMC
        double imc = peso / (altura * altura);

        /*
        * Dependendo do resultado do IMC, mostra-se uma mensagem diferente.
        */
        if (imc < 18.5) {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println(". Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println(". Seu peso está normal.");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println(". Você está com sobrepeso.");
        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println(". Você está com obesidade de grau I.");
        } else {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println(". Você está com obesidade de grau II.");
        }
    }
    
}

/*
Crie um algoritmo que receba a altura e peso do usuário, calcule seu
IMC e exiba sua classificação.
OBS: Fórmula: IMC = peso/ (altura x altura), a classificação se
encontra na tabela abaixo:

MENOR QUE 18,5 MAGREZA 
ENTRE 18,5 E 24,9 NORMAL 
ENTRE 25,0 E 29,9 SOBREPESO I
ENTRE 30,0 E 39,9 OBESIDADE II
MAIOR QUE 40,0 OBESIDADE GRAVE III
*/
