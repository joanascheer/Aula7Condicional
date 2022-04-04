import java.util.Scanner;

public class Exercicio2Condicional {
    public static void main(String[] args) {
        Scanner leAltura = new Scanner(System.in);
        Scanner lePeso = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = leAltura.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = lePeso.nextDouble();

        double imc = peso / (altura * altura);

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
